
import java.util.Arrays;
import java.util.Scanner;


public class contas {
    
    public static void main(String[] Args){
        
        Scanner input = new Scanner(System.in);
        
        int money, a, f, p;
        int result = 0;
        
        money = input.nextInt();
        a = input.nextInt();
        f = input.nextInt();
        p = input.nextInt();
        
        int[] bill = new int[3];
        
        bill[0] = a;
        bill[1] = f;
        bill[2] = p;
        
        Arrays.sort(bill);
        
        for(int i = 0; i <= 2; i++){
            if(money >= bill[0] && bill[0] != 0){
                money = money - bill[0];
                bill[0] = 0;
                result = result + 1;
            }else if(money >= bill[1] && bill[1] != 0){
                money = money - bill[1];
                bill[1] = 0;
                result = result + 1;
            }else if(money >= bill[2] && bill[2] != 0){
                money = money - bill[2];
                bill[2] = 0;
                result = result + 1;
            }
        }
        
        System.out.println(result);
        
    }
    
}