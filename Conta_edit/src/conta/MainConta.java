package conta;

import java.util.Scanner;

public class MainConta {
    
    public static void main (String args[]){
        
        double value;
        int months, i;
        int option, contaOption;
        double cash;
        
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        
        System.out.print("Type a value to simulation: ");
        value = scanner.nextDouble();
        
        conta.setBalance(value);
        contaPoupanca.setBalance(conta.getBalance());
        
        System.out.print("Type amount of months: ");
        months = scanner.nextInt();
        
        for(i = 0; i < months; i++ ){
            contaPoupanca.adjustment();
            contaCorrente.setBalance(contaPoupanca.getAdjustment());
            contaCorrente.PackageService();
            contaPoupanca.setBalance(contaCorrente.getBalance());
            conta.setBalance(contaCorrente.getBalance());
        }
        
        conta.printBalance();
        
        System.out.print("Type 1 to cash out, or 2 to done: ");
        option = scanner.nextInt();
        
        if(option == 1){
            System.out.print("Type 1 if you want cash out of Conta Poupança, or 2 if you want cash out of Conta Corrente: ");
            contaOption = scanner.nextInt();
            if(contaOption == 1){
                System.out.print("How much do you want cash out? Type the value: ");
                cash = scanner.nextDouble();
                contaCorrente.cashOut(cash);
                conta.setBalance(contaCorrente.getBalance());
            } else if(contaOption == 2){
                System.out.print("How much do you want cash out? Type the value: ");
                cash = scanner.nextDouble();
                contaPoupanca.cashOut(cash); 
                conta.setBalance(contaPoupanca.getBalance());
            }
        } else if(option == 2){
            System.out.println("Done!");
        }
        
        conta.printBalance();
        
    }
    
}
