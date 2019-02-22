package exerc02;

import java.util.Scanner;

public class Exerc02C {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[99999999];
        int number;
        int menorValor = 999999999;
        int maiorValor = 0;
        int i = 1;
        int position;
        int media;
        
        System.out.print("Enter with the 1º number of sequence: ");
        number = s.nextInt();
        
        while(number != 0){
            
            position = i + 1;
            
            System.out.print("Enter with the " + position +"º number of sequence: ");
            number = s.nextInt();
            
            vetor[i] = number;
            
            if(vetor[i] > maiorValor){
                
                maiorValor = vetor[i];
                
            } else if(vetor[i] < menorValor && vetor[i] != 0){
            
                menorValor = vetor[i];
            
            }
            
            i++;
            
        }
        
        media = (menorValor+maiorValor)/2;
        
        System.out.println("The smaller value is " + menorValor + " and the bigger value is " + maiorValor);
        System.out.println("The media of values are: " + media);
        
    }
    
}
