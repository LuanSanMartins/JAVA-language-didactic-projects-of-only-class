package exerc05;

import java.util.Scanner;

public class Exerc05B {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int number;
        int maiorValor = 0;
        int i = 0;
        int[] vetor = new int[100];
        
        System.out.print("Enter a number: ");
        number = s.nextInt();
        
        while(number!=0){
            
        System.out.print("Enter a number: ");
        number = s.nextInt();
        
        vetor[i] = number;
        
        if(vetor[i] > maiorValor){
            
            maiorValor = vetor[i];
            
        }
        
        i++;
            
        }
        
        System.out.println("The bigger value is: " + maiorValor);
        
    }
    
}
