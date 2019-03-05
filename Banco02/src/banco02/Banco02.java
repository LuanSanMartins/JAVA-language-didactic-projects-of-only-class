package banco02;

import java.util.Scanner;

public class Banco02 {

    public static void main(String[] args) {
        
        String name = "cliente";
        String nameDel;
        String number = "0000";
        String numCPF = "00000000";
        int option = 1;
        
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(name, numCPF, number);
        
        do{
        
            System.out.print("Enter name of custumer: ");
            name = scanner.nextLine();
            
            cliente.setName(name);
        
            System.out.print("Enter number of CPF: ");
            numCPF = scanner.nextLine();
        
            cliente.setCPF(numCPF);
        
            System.out.print("Enter number of account: ");
            number = scanner.nextLine();
            
            cliente.setNumero(number);
            
            cliente.setConta(name, cliente.nameCPF());
        
            System.out.print("Enter 1 to register other custumer, 2 to delete, or enter 0 to done: ");
            option = scanner.nextInt();
        
            scanner.nextLine();
            
            if(option == 2){
                
                System.out.print("What costumer you want delete: ");
                nameDel = scanner.nextLine();
                
                cliente.removeConta(nameDel);
                
                System.out.print("Enter 1 to register other custumer, 2 to delete, or enter 0 to done: ");
                option = scanner.nextInt();
        
                scanner.nextLine();
                
            }
        
        } while(option != 0);
        
        cliente.listarContas();
        
    }
    
}
