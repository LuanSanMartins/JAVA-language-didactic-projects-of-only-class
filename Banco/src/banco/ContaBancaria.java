package banco;

public class ContaBancaria {
    
    private int numero;
    private double saldo;
        
    ContaBancaria(int numero, double saldo){
        this.saldo = saldo;
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
        
    public double getSaldo(){
        return saldo;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
        
    public void sacar (double valor){
        saldo = saldo - valor;
    }
        
    public void depositar (double valor){
        saldo = saldo + valor;
    }
    
}
