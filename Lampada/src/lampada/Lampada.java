package lampada;

public class Lampada {
 
    protected boolean status;
    
    Lampada(boolean status){
        
        this.status = false;
    }
        
    public void onLamp(){
            
        this.status = true;
            
    }
        
    public void offLamp(){
            
        this.status = false;
            
    }
    
}
