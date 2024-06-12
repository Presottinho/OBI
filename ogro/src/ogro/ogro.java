package ogro;

import java.util.Scanner;

public class ogro {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int E;
        int D;
        
        E = keyboard.nextInt();
        D = keyboard.nextInt();
        
        if(E > D){
            System.out.println(E + D);
        }else if(E < D){
            System.out.println(2 * (D - E));
        }
        
    }
    
}
