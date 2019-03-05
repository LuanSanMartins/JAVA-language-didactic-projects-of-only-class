package banco03;

import java.util.HashMap;

public class Agencia {

    String name;
    int account;
    
    Agencia(String name, int account){
        this.name = name;
        this.account = account;
    }
    
    HashMap<String, Integer> hashMap = new HashMap();
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAccount(int account){
        this.account = account;
    }
    
    public void setNameAccount(){
        hashMap.put(name, account);
    }
    
    public void getNameAccount(){
        System.out.println(hashMap);
    }
}
