package cliente;

import java.util.HashMap;

public class Cliente {

    private String nome;
    private Double CPF;
    int numero;
    int i, j;
    
    HashMap<String, Integer> listContas = new HashMap();
    
    public void setConta (String nome, int numero){
       // this.numero = numero;   
       // for(i = 0; i < listContas.size(); i++){
            
            listContas.put(nome, numero);
            
       // }
        
    }
    
    public void removeConta(){
        
        listContas.remove(nome);
        
    }
    
    public void listarContas(){
        
        for(j = 0; j < listContas.size(); j++){
            
            System.out.println(listContas.get(j));
            
        }
        
    }
    
}
