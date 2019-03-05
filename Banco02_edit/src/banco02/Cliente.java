package banco02;

import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String numero;
    private int posDel;
       
    Cliente(String nome, String CPF, String numero){
        this.nome = nome;
        this.CPF = CPF;
        this.numero = numero;
    }
    
    public void setCPF (String CPF){
        this.CPF = CPF;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
    
    public void setNumero (String numero){
        this.numero = numero;
    }
    
    ArrayList<String> arrayList = new ArrayList();
    
    public void setConta (){
        
            arrayList.add("Name: " + nome + "; Conta: " + numero + "; CPF: " + CPF);
        
    }
       
    public void removeConta(String numero){
        
        for (int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(i).contains("Conta: " + numero + "; ")) {
                arrayList.remove(i);
            }    
        }
    }    
    
    public void listarContas(){
       
       System.out.println(arrayList);
        
    }
    
}
