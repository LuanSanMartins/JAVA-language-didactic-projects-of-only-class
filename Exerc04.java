package exerc04;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        float num01, num02;
        float aux;
        
        System.out.println("Enter a first value: ");
        num01 = s.nextFloat();
        
        System.out.println("Enter a second value");
        num02 = s.nextFloat();
        
        aux = num02;
        num02 = num01;
        num01 = aux;
        
        System.out.println("Now the first value is: " + num01);
        System.out.println("Now the second value is: " + num02);
        
    }
    
}
