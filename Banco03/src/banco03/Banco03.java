package banco03;

import java.util.Scanner;

public class Banco03 {

    public static void main(String[] args) {
        
            
        String NAME = "custumer";
        int ACCOUNT = 0000;
        int OPTION = 1;
        
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia(NAME, ACCOUNT);
    
        do{
    
            System.out.print("Type the name of custumer: ");
            NAME = scanner.nextLine();
            
            agencia.setName(NAME);
            
            System.out.print("Type the account number of custumer: ");
            ACCOUNT = scanner.nextInt();
            
            agencia.setAccount(ACCOUNT);
            
            agencia.setNameAccount();
                        
            System.out.print("Type 1 to register one more custumer, or type 0 to done: ");
            OPTION = scanner.nextInt();
            
            scanner.nextLine();
    
        } while(OPTION != 0);
        
        agencia.getNameAccount();
        
    }
    
}
