package exerc04;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.List;

public class Exerc04C {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> register = new HashMap();
        
        String name;
        int age, option, i, media;
        int old = 0;
        int k = 0;
        int z = 0;
        int young = 999999999;
        
        do {
            
            System.out.print("Enter your name: ");
            name = s.nextLine();
            
            System.out.print("Enter your age: ");
            age = s.nextInt();
            
            register.put(name, age);
            
            System.out.print("Choose option 1 to register one more, or option 0 to done: ");
            option = s.nextInt();
            
            s.nextLine();
        
        } while( option != 0);
        
        List<Integer> vetorInt = new ArrayList<Integer>(register.values());
        
        List<Entry> vetorRegister = new ArrayList<Entry>(register.entrySet());
        
        for(i = 0; i < vetorInt.size(); i++){
            
            if(vetorInt.get(i) > old){
                
                old = vetorInt.get(i);
                
                k = i;
                
            }
            
            if(vetorInt.get(i) < young){
                
                young = vetorInt.get(i);
                
                z = i;
                
            }
            
        }
        
        media = (old+young)/2;
        
        System.out.println(register);
        System.out.println("The person old more is: " + vetorRegister.get(k));
        System.out.println("The person young more is: " + vetorRegister.get(z));
        System.out.println("The media of age between the person old more and young more is: " + media);
        
    }
    
}
