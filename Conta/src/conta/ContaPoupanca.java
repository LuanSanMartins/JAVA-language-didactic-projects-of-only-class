package conta;

public class ContaPoupanca extends Conta{
   
    protected double yield = 0.1;
    
    @Override
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void adjustment(){   
        balance = balance + balance*yield;
    }
    
    public double getAdjustment(){
        return balance;
    }
    
}
