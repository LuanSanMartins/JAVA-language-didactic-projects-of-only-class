package exerc03;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int options;
        
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        
        System.out.print("Chooser a option: ");
        options = s.nextInt();
        
        switch(options){
            
            case 1:
                System.out.println("The option 1 was choosen!");
                break;
                
            case 2:
                System.out.println("The option 2 was choosen!");
                break;
                
            case 3:
                System.out.println("The option 3 was choosen!");
                break;
                
            default:
                System.out.println("The option invalid");
                break;
        }
        
    }
    
}
