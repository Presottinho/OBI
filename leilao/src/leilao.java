import java.util.Scanner;
public class leilao {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        
        int numOfPeople = input.nextInt();
        int higherValue = 0;
        
        String[] names = new String[numOfPeople];
        int[] values = new int[numOfPeople];
        
        String winner = null;
        
        for(int i = 0; i < numOfPeople; i++){
            names[i] = input.next();
            values[i] = input.nextInt();
            
            if(values[i] > higherValue){
                higherValue = values[i];
                winner = names[i];
            }
        }
        
        System.out.println(winner + "\n" + higherValue);
    }
}
