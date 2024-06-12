package concurso;

import java.util.Scanner;
import java.util.Arrays; 

public class concurso {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int N, K, AUX;
        
        N = keyboard.nextInt();
        K = keyboard.nextInt();
        
        int[] A = new int[N + 1];
        
        for(int i = 0; i < N; i++){
            A[i] = keyboard.nextInt();
        }
        
        for(int i = 1; i <= N; i++){
            if(A[i - 1]< A[i]){
                AUX = A[i];
                A[i] = A[i - 1];
                A[i - 1] = AUX;
                i = 0;
            }
        }
        
        System.out.println(A[K - 1]);
        
    }
    
}
