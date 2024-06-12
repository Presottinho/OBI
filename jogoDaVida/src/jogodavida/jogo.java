package jogodavida;

import java.util.Scanner;
import java.util.Arrays; 

public class jogo {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int N, Q;
        
        N = keyboard.nextInt();
        Q = keyboard.nextInt();
        
        int[][] MATRIZ = new int[N][1];
        int[][] MATRIZAUX = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int h = 0; h < 3; h++){
                MATRIZ[h][i] = keyboard.nextInt();
            }
        }
            
        for(int i = 0; i < N; i++)
            for(int h = 0; h < N; h++){
                if(MATRIZ[h][0] % 2 == 0){
                    MATRIZAUX[h][N] = 0;
                }else{
                    MATRIZAUX[h][N] = 1;
                    MATRIZ[h][0] = MATRIZ[h][0] - 1;
                    if(MATRIZ[h][0] % 2 == 0){
                        MATRIZAUX[h][N - i] = 0;
                    }
                }
            }
        
        for(int i = 0; i < N; i++){
            for(int k = 0; k < 3; k++){
                System.out.println(MATRIZAUX[k][i]);
            }
            System.out.println("\n");
        }
    }
    
}
