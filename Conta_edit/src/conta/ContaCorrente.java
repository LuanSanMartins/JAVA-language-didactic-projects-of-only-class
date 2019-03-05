package conta;

public class ContaCorrente extends Conta {
   
    protected double service = 9.90;
    
    @Override
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    @Override
    public double getBalance(){
        return balance;
    }
    
    public void PackageService (){
        balance = balance - service;
    }
    
    @Override
    public void cashOut(double cash){
        
        if(cash <= balance + 100){
            balance = balance - cash;
        } else{
            System.out.println("Cash out isn't authorized!");
        }
        
    }
    
}
