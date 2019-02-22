package exerc01;

import java.util.Scanner;

public class Exerc01C {

    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        int i;
        float maiorValor = 0;
        float menorValor = 999999999;
        int position;
        float media;
        
        Scanner s = new Scanner(System.in);
        
        for(i = 0; i < 5; i++){
            
            position = i + 1;
            
            System.out.print("Enter a " + position + "º number of sequence: ");
            vetor[i] = s.nextInt();
            
            if(vetor[i] > maiorValor){
                
                maiorValor = vetor[i];
                
            } else if(vetor[i] < menorValor){
                
                menorValor = vetor[i];
                
            }
            
        }
        
        media = (menorValor + maiorValor)/2;
        
        System.out.println("The smaller value is: " + menorValor + " and the bigger value is: " + maiorValor);
        System.out.println("The media of values are: " + media);
        
    }
    
}
