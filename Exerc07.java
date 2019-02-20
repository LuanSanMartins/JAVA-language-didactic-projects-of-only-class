package exerc07;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        
        String text;
        String latterOne;
        String latterTwo;
        String result;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        text = s.nextLine();
        
        System.out.print("Enter a latter: ");
        latterOne = s.nextLine();
        
        System.out.print("Enter a latter or sentence to replace: ");
        latterTwo = s.nextLine();
        
        result = text.replace(latterOne, latterTwo);
        
        System.out.println("Now the sentence is: " + result);
        
    }
    
}
