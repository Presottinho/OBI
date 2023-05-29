package etiquetas;

import java.util.Scanner;

public class Etiquetas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int red, green, blue, tam, tam2, result;
        
        red = input.nextInt();
        green = input.nextInt();
        blue = input.nextInt();
        
        tam = red / green;
        tam = tam * tam;
        tam2 = green / blue;
        tam2 = tam2 * tam2;
        
        result = (tam * tam2);
        
        System.out.println(result);
                
    }
    
}
