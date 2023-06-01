
import java.util.Scanner;

public class toupeira {
    
    public static void main(String[] Args){
        
        Scanner input = new Scanner(System.in);
        
        int numOfTunels = input.nextInt();
        int numOfStreets = input.nextInt();
        
        int[] streets1 = new int[numOfStreets];
        int[] streets2 = new int[numOfStreets];
        
        for(int i = 0; i < numOfStreets; i++){
            streets1[i] = input.nextInt();
            streets2[i] = input.nextInt();
        }
        
        int numOfCaminhos = input.nextInt();
        
        int numMaxHouses = input.nextInt();
        int[] gps = new int[numMaxHouses];
                       
        for(int h = 0; h < numOfCaminhos; h++){
            gps[h] = input.nextInt();
        }
                       
        for(int g = 0; g < numMaxHouses; g++){
            if(g == 0){
                break;
            }
            
            for(int b = 0; b < numMaxHouses; b++){
                if(streets1[b] == gps[g] || streets2[b] == gps[g]){
                    break;
                }
            }
                
            
        }
        
        for(int u = 0; u < numOfStreets; u++){
            
        }
        
    }
    
}
