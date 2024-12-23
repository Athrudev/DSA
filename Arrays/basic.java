package Arrays;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String menu[]={"dosa","vada pav","chaha"};
        System.out.print("Enter the item to be found:");
        String key=sc.nextLine();

        for(int i=0;i<menu.length;i++){
            /* System.out.println(menu[i]);
            System.out.println(key); */
            if(menu[i].equals(key)){  
                System.out.println("Found at the place: "+(i+1));
                found=true;
            }
        }

        if(!found){
            System.out.println("Not found");
        }
    }
    



}
    
