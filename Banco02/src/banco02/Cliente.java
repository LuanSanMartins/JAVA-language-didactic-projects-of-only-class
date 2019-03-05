package banco02;

import java.util.HashMap;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String numero;
       
    Cliente(String nome, String CPF, String numero){
        this.nome = nome;
        this.CPF = CPF;
        this.numero = numero;
    }
    
    HashMap<String, String> listContas = new HashMap();
    
    public void setCPF (String CPF){
        this.CPF = CPF;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
    
    public void setNumero (String numero){
        this.numero = numero;
    }
    
    public String nameCPF(){
        return "CPF: " + CPF + " Conta: " + numero;
    }
    
    public void setConta (String nome, String numero){
  
            listContas.put(nome, numero);
        
    }
       
    public void removeConta(String nome){
        
        listContas.remove(nome);
        
    }
    
    public void listarContas(){
       
       System.out.println(listContas);
        
    }
    
}
