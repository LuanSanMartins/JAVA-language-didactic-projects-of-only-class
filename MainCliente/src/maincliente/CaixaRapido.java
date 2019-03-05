package maincliente;

public class CaixaRapido {
    
    double balance = 1000;
    
    public void cashOut(double cash){
        this.balance = balance - cash;
    }
    
    public void cashIn(double cash){
        this.balance = balance + cash;
    }
    
    public double getBalance(){
        return balance;
    }
    
}
