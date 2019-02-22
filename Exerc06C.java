package exerc06;

import java.util.Scanner;
import java.util.HashSet;

public class Exerc06C {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        HashSet<Integer> telephone = new HashSet(); 
        
        int number, option;
        
        do{
            
            System.out.print("Enter the telephone number: ");
            number = s.nextInt();
            
            telephone.add(number);
            
            System.out.print("Enter the number 1 to register one more telephone, or enter 0 to done: ");
            option = s.nextInt();
            
        } while(option != 0);
        
        System.out.println(telephone);
        
    }
    
}
