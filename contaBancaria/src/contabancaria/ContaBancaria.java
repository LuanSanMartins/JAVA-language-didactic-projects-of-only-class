package contabancaria;

public class ContaBancaria {

    int numero;
    private Double saldo;
        
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
        
    public Double getSaldo(){
        return saldo;
    }
        
    public void sacar (Double valor){
        saldo = saldo - valor;
    }
        
    public void depositar (Double valor){
        saldo = saldo + valor;
    }
    
}
