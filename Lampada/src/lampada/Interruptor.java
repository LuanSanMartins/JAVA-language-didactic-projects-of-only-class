package lampada;

public class Interruptor {    
    
        private Lampada luz = new Lampada(false);
    
        public void onLuz(){
    
            luz.onLamp();
           
        } 
        
        public void offLuz(){
    
            luz.offLamp();
            
            
        }
      
    }
    
