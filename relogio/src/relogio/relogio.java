package relogio;

import java.util.Scanner;

public class relogio {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int H, M, S, T, R, AUX;
        
        H = keyboard.nextInt();
        M = keyboard.nextInt();
        S = keyboard.nextInt();
        T = keyboard.nextInt();
        
        H = H * 3600;
        M = M * 60;
        R = H + M + S + T;

        for(int i = 0; i < 3; i++){
            if(R >= 3600){
                H = R / 3600;
                R = R - (3600 * H);
                if(H / 24 != 0){
                    AUX = H / 24;
                    H = H - (24 * AUX);                    
                }
                if(R > 0){
                    i = 0;
                }else{
                    M = R;
                    S = R;
                    i = 3;
                }
            }else if(R >= 60 && R <= 3599){
                M = R / 60;
                R = R - (60 * M);
                i = 0;
            }else{
                S = R;
                i = 3;
            }
        }
        
        System.out.println(H);
        System.out.println(M);
        System.out.println(S);
        
    }
    
}
