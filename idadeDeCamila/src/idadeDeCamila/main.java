package idadeDeCamila;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

        int[] years = new int[3];

        System.out.println("Digite as três idades: ");
       
        for(int i = 0; i <= 2; i++){
            years[i] = keyboard.nextInt();
        }

        if(years[0] >= years[1] && years[0] <= years[2]){
            System.out.println(years[0]);
        }else if(years[1] >= years[2] && years[1] <= years[0]){
            System.out.println(years[1]);
        }else if(years[0] <= years[1] && years[0] >= years[2]){
            System.out.println(years[0]);
        }else if(years[1] <= years[2] && years[1] >= years[0]){
            System.out.println(years[1]);
        }else{
            System.out.println(years[2]);
        }
    }
}
