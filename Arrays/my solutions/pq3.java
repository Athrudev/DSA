
public class pq3 {

    public static int solution(int price[]){

        int n=price.length;
        int buyprice=price[0];
        int maxprofit=0;

        for(int i=1;i<n;i++){
            int current=price[i];
            if(current>buyprice){
                int todayProfit=current-buyprice;
                maxprofit=Math.max(maxprofit,todayProfit);
            }else{
                buyprice=price[i];
            }
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int price1[]={7,1,5,6,3,4};
        int price2[]={7,6,4,3,1};

        System.out.println("test case 1:"+solution(price1));
        System.out.println("test case 2:"+solution(price2));
        
    }
}
