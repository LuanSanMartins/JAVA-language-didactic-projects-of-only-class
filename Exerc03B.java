package exerc03;

import java.util.Scanner;

public class Exerc03B {

    public static void main(String[] args) {
        
        int num01, num02, num03;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a first number: ");
        num01 = s.nextInt();
        
        System.out.print("Enter a second number: ");
        num02 = s.nextInt();
        
        System.out.print("Enter a third number: ");
        num03 = s.nextInt();
        
        if(num01>num02 && num01>num03 && num02>num03){
            
            System.out.println(num01 + " > " + num02 + " > " + num03);
            
        } else if(num01>num02 && num01>num03 && num03>num02){
            
            System.out.println(num01 + " > " + num03 + " > " + num02);
            
        } else if(num02>num01 && num02>num03 && num01>num03){
            
            System.out.println(num02 + " > " + num01 + " > " + num03);
            
        } else if(num02>num01 && num02>num03 && num03>num01){
            
            System.out.println(num02 + " > " + num03 + " > " + num01);
            
        } else if(num03>num01 && num03>num02 && num01>num02){
            
            System.out.println(num03 + " > " + num01 + " > " + num02);
            
        } else if(num03>num01 && num03>num02 && num02>num01){
            
            System.out.println(num03 + " > " + num02 + " > " + num01);
            
        }
        
    }
    
}
