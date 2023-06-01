import java.util.Scanner;

public class troca {
    public static void main(String[] Args){

        Scanner keyboard = new Scanner(System.in);

        int numOfCards = keyboard.nextInt();
        int numOfChanges = keyboard.nextInt();

        int[] cardsUp = new int[numOfCards];
        int[] cardsDown = new int[numOfCards];

        for(int i = 0; i <= numOfCards; i++){
            cardsUp[i] = keyboard.nextInt();
            
        }

        for(int k = 0; k <= numOfCards; k++){
            cardsDown[k] = keyboard.nextInt();
        }

        System.out.println(cardsDown.toString() + " " + cardsUp.toString());

    }
}
