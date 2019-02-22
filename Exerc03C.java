package exerc03;

import java.util.HashSet;
import java.util.Scanner;

public class Exerc03C {

    public static void main(String[] args) {
        
        int value;
        int maiorValor = 0;
        int menorValor = 999999999;
        int media, i;
        
        Scanner s = new Scanner(System.in);
        HashSet<Integer> inteiro = new HashSet();
        
        do {
        
            System.out.print("Enter a value: ");
            value = s.nextInt();
        
            if(value != 0){
        
                inteiro.add(value);
        
            }
            
        } while(value != 0);
        
            Integer[] vetor = new Integer[inteiro.size()];
            inteiro.toArray(vetor);
            
            for(i = 0; i < vetor.length; i++){
            
                if(vetor[i] > maiorValor){
            
                    maiorValor = vetor[i];
            
                } if(vetor[i] < menorValor && vetor[i] != 0){
            
                    menorValor = vetor[i];
            
                }
            
            }
        
        media = (menorValor + maiorValor)/2;
        
        System.out.println("The elements are: " + inteiro);
        System.out.println("The smaller value is " + menorValor + " and the bigger value is " + maiorValor);
        System.out.println("The media between the smaller and bigger value is: " + media);
        
    }    
    
}
