package maincliente;

import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {
        
        int option;
        double cash;
        
        Scanner scanner = new Scanner (System.in);
        CaixaRapido caixaRapido = new CaixaRapido();
        
        System.out.print("Type 1 to cash deposit, 2 to cash out, 3 to see balance, or 4 to done: ");
        option = scanner.nextInt();
        
        switch(option){
            case 1:
                System.out.print("Type the value that you want deposit: ");
                cash = scanner.nextDouble();
                caixaRapido.cashIn(cash);
                break;
            case 2:
                System.out.print("Type the value that yout want out: ");
                cash = scanner.nextDouble();
                caixaRapido.cashOut(cash);
                break;
            case 3:
                System.out.println(caixaRapido.getBalance());
                break;
            case 4:
                System.out.print("Done!");
                break;
            default:
                System.out.print("Invalid operation!");
        }
        
        System.out.println(caixaRapido.getBalance());
        
    }
    
}
