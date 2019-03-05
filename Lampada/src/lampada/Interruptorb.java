package lampada;

import java.util.Scanner;

public class Interruptorb {

    public static void main (String args[]){
        
        String command;    
    
        Lampada luz = new Lampada(false);
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a command: ");
        command = scanner.nextLine();
    
        if(command.equals("on")){
    
            luz.onLamp();
            System.out.println(luz.status);
    
        } else if(command.equals("off")){
    
            luz.offLamp();
            System.out.println(luz.status);
            
        }
      
    }
    
}
