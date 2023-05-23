import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite os resultados: ");
		
		String[] matchs = new String[6];
		int result = 0;

		for(int i = 0; i <= 5; i++) {
			matchs[i] = keyboard.next();
		}
		
		for(int r = 0; r <= 5; r++) {
			if(matchs[r].equals("v")) {
				result = result + 1;
			}
		}
		
		if(result >= 5) {
			System.out.println("1");
		}else if(result >= 3) {
			System.out.println("2");
		}else if(result >= 1) {
			System.out.println("1");
		}else {
			System.out.println("-1");
		}

	}

}
