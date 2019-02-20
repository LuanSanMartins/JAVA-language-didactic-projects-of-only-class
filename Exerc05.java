package exerc05;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String text;
        String latter;
        boolean check;
        
        System.out.println("Enter with a sentence: ");
        text = s.nextLine();
        
        System.out.println("Enter with a latter");
        latter = s.nextLine();
        
        check = text.toLowerCase().contains(latter.toLowerCase());
        
        if(check==true){
            
            System.out.println("There is the latter in the sentence");
            
        } else {
            
            System.out.println("There isn't the latter in the sentence");
            
        }
        
    }
    
}
