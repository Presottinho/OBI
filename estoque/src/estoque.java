
import java.util.Scanner;


public class estoque {
    
    public static void main(String[] Args){
        
        Scanner input = new Scanner(System.in);
        
        int linhas = input.nextInt();
        int colunas = input.nextInt();
        int vendas = 0;
        
        int[][] estoque = new int[linhas][colunas];
        
        for(int i = 0; i < colunas; i++){
            for(int u = 0; u < linhas; u++){
                estoque[i][u] = input.nextInt();
        }
            
        int clientes = input.nextInt();
        
        for(int c = 0; c < clientes; c++){
            int x = input.nextInt();
            int y = input.nextInt();
            
            if(estoque[x][y] > 0){
                estoque[x][y] = estoque[x][y] - 1;
                vendas = vendas + 1;
            }
        }
        
        System.out.println(vendas);
        
    }
  }
    
}
