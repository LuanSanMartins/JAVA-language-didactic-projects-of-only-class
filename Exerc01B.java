package exerc01;

import java.util.Scanner;

public class Exerc01B {

    public static void main(String[] args) {
        
        int num01, num02;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a first number: ");
        num01 = s.nextInt();
        
        System.out.print("Enter a second number: ");
        num02 = s.nextInt();
        
        if(num01>num02){
            
            System.out.println(num01 + " is bigger than " + num02);
            
        } else if(num01<num02){
            
            System.out.println(num02 + " is bigger than " + num01);
            
        } else if(num01==num02){
            
            System.out.println(num01 + " is equals " + num02);
            
        }
        
    }
    
}
