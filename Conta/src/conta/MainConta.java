package conta;

import java.util.Scanner;

public class MainConta {
    
    public static void main (String args[]){
        
        double value;
        int months, i;
        
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
        }
        
        conta.printBalance();
        contaCorrente.printBalance();
        
    }
    
}
