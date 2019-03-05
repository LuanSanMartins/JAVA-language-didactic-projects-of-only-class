package conta;

public class Conta {

    protected double balance;
    protected double cash;
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void cashOut(double cash){
        balance = balance - cash;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void printBalance(){
        System.out.println("The final balance is: " + balance);
    }
    
}
