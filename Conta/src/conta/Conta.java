package conta;

public class Conta {

    protected double balance;
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void printBalance(){
        System.out.println("The initial balance is: " + balance);
    }
    
}
