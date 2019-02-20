package exerc01;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
       
        float num01;
        float num02;
        float sum, mult, div, subt;
        
        System.out.println("Enter a first number: ");
        num01 = s.nextFloat();
        
        System.out.println("Enter a second number: ");
        num02 = s.nextFloat();
        
        sum = num01 + num02;
        subt = num01 - num02;
        div = num01/num02;
        mult = num01*num02;
        
        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subt);
        System.out.println("The division: " + div);
        System.out.println("The multiplication is: " + mult);
        
    }
    
}
