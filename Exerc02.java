package exerc02;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        float note01, note02;
        float media;
        
        System.out.println("Enter a first note: ");
        note01 = s.nextFloat();
        
        System.out.println("Enter a second note: ");
        note02 = s.nextFloat();
        
        media = (note01 + note02)/2;
        
        System.out.println("The media is: " + media);
        
    }
    
}
