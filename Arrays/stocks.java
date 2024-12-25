package Arrays;

public class stocks {

    public static int BuyAndSellStocks(int price[]){
        int buyPrice=price[0];
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){//profit
                int profit=price[i]-buyPrice; //today's profit
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=price[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is: "+BuyAndSellStocks(price));
        
    }
}
