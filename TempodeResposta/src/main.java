import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de eventos: ");
		int numEvents = (keyboard.nextInt() * 2);
		
		String[] events = new String[numEvents];
		String[] letters = new String[numEvents];
		int[] position = new int[numEvents];
		int[] numbers = new int[numEvents];
		
		int result = 0;
		
		for(int i = 0; i < numEvents; i++) {
			String event = keyboard.next();
			events[i] = event;
		}
		
		for(int e = 0; e < numEvents; e++) {
			for(char c : events[e].toCharArray() ) {
				if(Character.isLetter(c) ) {
					letters[e] = Character.toString(c);
				}else{
					numbers[e - 1] = Character.getNumericValue(c);
				}
				
			}
			
		}
		
		for(int x = 0; x < numEvents; x++) {
			int test = 1;
			
			position[x] = test;
			
			for(int y = 0; y < numEvents; y++) {
				if(numbers[y] == test) {
					position[y] = numbers[y];
					System.out.println("Adicionei " + numbers[y] + " " + numbers[x] + " " + y);
				}
				
				System.out.println(position[y] + " menos " + position[x]);
				result = position[y] - position[x];
				
			}
			
		}
		
		System.out.println(result);
		
			
			for(int r = 0; r < numEvents; r++) {
				if(letters[r] != null && numbers[r] != 0) {
					System.out.println("------" + letters[r] + " " + numbers[r]);
				}
			}
			
	}
		
		
		
}