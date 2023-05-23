import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números dito pelo chefe.");
		int numOfNumbers = keyboard.nextInt();
		
		int[] numbers = new int[numOfNumbers];
		int result = 0;
		
		for(int i = 0; i < numOfNumbers; i++) {
			numbers[i] = keyboard.nextInt();
		}
		
		for(int p = 0; p < numOfNumbers; p++) {
			if(numbers[p] == 0) {
				for(int y = p; y >= 0; y--) {
					if(numbers[y] != 0) {
						numbers[y] = 0;
						y = 0;
					}
				}
			}
		}
		
		for(int u = 0; u < numOfNumbers; u++) {
			result = result + numbers[u];
		}
		
		System.out.println(result);
		
	}

}
