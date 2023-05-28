package cifraDeNlogônia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		char[] alphabet = new char[24];
		List vogals = new ArrayList();
		
		alphabet[0] = 'a';
		alphabet[1] = 'b';
		alphabet[2] = 'c';
		alphabet[3] = 'd';
		alphabet[4] = 'e';
		alphabet[5] = 'f';
		alphabet[6] = 'g';
		alphabet[7] = 'h';
		alphabet[8] = 'i';
		alphabet[9] = 'j';
		alphabet[10] = 'k';
		alphabet[11] = 'l';
		alphabet[12] = 'm';
		alphabet[13] = 'n';
		alphabet[14] = 'o';
		alphabet[15] = 'p';
		alphabet[16] = 'q';
		alphabet[17] = 'r';
		alphabet[18] = 's';
		alphabet[19] = 't';
		alphabet[20] = 'u';
		alphabet[21] = 'v';
		alphabet[22] = 'x';
		alphabet[23] = 'z';
		
		vogals.add("a");
		vogals.add("e");
		vogals.add("i");
		vogals.add("o");
		vogals.add("u");
		
		System.out.println("Informe a palavra desejada para criptograr. ");
		String word = keyboard.next();
		
		List result = new ArrayList();
		
		char[] splitted = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			splitted[i] = word.charAt(i);
			System.out.println(splitted[i]);
		}

		
		for(int p = 0; p < word.length(); p++) {
				if(vogals.contains(splitted[p])) {
					result.add(splitted[p]);
				}else {
					result.add(splitted[p]);
					for(int u = 0; u < alphabet.length; u++) {
						int proximityF = 0;
						int proximityS = 0;
						int proximity = 0;
						
						if(splitted[p] == alphabet[u]) {
							for(int z = u; z < alphabet.length; z++) {
								if(vogals.contains(alphabet[z])) {
									proximityF = u;

								}
							}
						
							for(int h = u; h > 0; h--) {
								if(vogals.contains(alphabet[h])) {
									proximityF = h;
								}
							}
							
							if(proximityF > proximityS) {
								result.add(alphabet[proximityS]);
							}else{
								result.add(alphabet[proximityF]);
							}
							
							for(int v = p; v < alphabet.length; v++) {
								if(vogals.contains(alphabet[p])) {
										
								}else {
									result.add(alphabet[p]);
																
								}	
							}
						}
					}
			}
		
			System.out.println(result.toString() + " " + result.size());
			
		}
	}
}
