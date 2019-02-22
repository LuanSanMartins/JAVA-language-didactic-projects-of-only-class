package exerc05;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

public class Exerc05C {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> register = new HashMap();
        
        int note;
        String student;
        int i, j, option;
        int maiorNota = 0;
        int k = 0;
        
        do {
            
            System.out.print("Enter the name of student: ");
            student = scanner.nextLine();
            
            System.out.print("Enter the note of student: ");
            note = scanner.nextInt();
            
            register.put(student, note);
            
            System.out.print("Enter the number 1 to continue registering, or enter the number 0 to done: ");
            option = scanner.nextInt();
            
            scanner.nextLine();
            
        } while(option != 0);
        
        List<Integer> vetorNote = new ArrayList<Integer>(register.values());
        
        List<Entry> vetorStudent = new ArrayList<Entry>(register.entrySet());
        
        for(i = 0; i < vetorNote.size(); i++){
            
            if(vetorNote.get(i) > maiorNota){
                
                maiorNota = vetorNote.get(i);
                
                k = i;
                
            }
            
        }
        
        System.out.println("The student with the note bigger is: " + vetorStudent.get(k));
        
        System.out.println("The student with note smaller than 5 are: ");
        
        for(j = 0; j < vetorNote.size(); j++){
            
            if(vetorNote.get(j) < 5){
                
                System.out.println(vetorStudent.get(j));
                
            }
            
        }
        
    }
    
}
