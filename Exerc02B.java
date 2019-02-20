package exerc02;

import java.util.Scanner;

public class Exerc02B {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int number;
        int numAbs;
        
        System.out.print("Enter a number: ");
        number = s.nextInt();
        
        numAbs = Math.abs(number);
        
        System.out.println("The number absolute is: " + numAbs);
        
    }
    
}
