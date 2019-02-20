package exerc06;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String text;
        String latter;
        int check, position;
        
        System.out.print("Enter a sentence: ");
        text = s.nextLine();
        
        System.out.print("Enter a latter: ");
        latter = s.nextLine();
        
        check = text.toLowerCase().indexOf(latter.toLowerCase());
        position = check + 1;
        
        System.out.println("The position of latter entered is: " + position);
        
    }
    
}
