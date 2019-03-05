package largestvaluetyped;

import java.util.Scanner;

public class LargestValueTyped {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int enter[] = new int[5];
        int maiorValor = 0;
        
        for(i = 0; i < 5; i++){
        
            System.out.print("Enter a number: ");
            enter[i] = scanner.nextInt();
            
            if(enter[i] > maiorValor){
                maiorValor = enter[i];
            }
        
        }
        
        System.out.println("The largest number is: " + maiorValor);
    
    }
    
}
