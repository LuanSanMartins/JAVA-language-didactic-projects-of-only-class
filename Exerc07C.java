package exerc07;

import java.util.Scanner;
import java.util.HashSet;

public class Exerc07C {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        HashSet<Integer> list = new HashSet();
        
        int num, i, p, search;
        boolean check;
        
        for(i = 0; i < 5; i++){
            
            p = i + 1;
            System.out.print("Enter a " + p + "º number: ");
            num = s.nextInt();
            
            list.add(num);
            
        }
        
        System.out.print("Enter with the number that want search: ");
        search = s.nextInt();
        
        check = list.contains(search);
        
        if(check == true){
            
            System.out.println("There is the number in list");
            
        } else {
            
            System.out.println("There isn't the number in list");
            
        }
        
        System.out.println("The numbers entered are: " + list);
    }
    
}
