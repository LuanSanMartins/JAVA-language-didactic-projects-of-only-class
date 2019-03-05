package banco;

import java.util.Scanner;

public class Banco {

    
    public static void main(String[] args) {
        
        double valorIn = 0.0; 
        double valorSac, valorDep;
        int numeroConta = 0;
        
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, valorIn);
        
        System.out.print("Enter with account number: ");
        numeroConta = scanner.nextInt();
        
        contaBancaria.setNumero(numeroConta);
        
        System.out.print("Enter with initial value of cash : ");
        valorIn = scanner.nextInt();
        
        contaBancaria.setSaldo(valorIn);
        
        System.out.print("Enter the value to cash deposit: ");
        valorDep = scanner.nextInt();
        
        contaBancaria.depositar(valorDep);
        
        System.out.print("Enter the value to cash out: ");
        valorSac = scanner.nextInt();
        
        contaBancaria.sacar(valorSac);
        
        System.out.println("The balance of account " + contaBancaria.getNumero() + " is: " + contaBancaria.getSaldo());
        
    }
    
}
