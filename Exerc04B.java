package exerc04;

import java.util.Scanner;

public class Exerc04B {

    public static void main(String[] args) {
        
        int m, n, i;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a first number: ");
        m = s.nextInt();
        
        System.out.print("Enter a second number: ");
        n = s.nextInt();
        
        if(m>n){
            
            for(i = 1; i <= m; i++){
                
                if(i%2==0 && i >= n){
                    
                    System.out.print(i + ", ");
                    
                }
                
            }
            
        } else if(n>m){
            
            for(i = 1; i <= n; i++){
                
                if(i%2==0 && i >= m){
                    
                    System.out.print(i + ", ");
                    
                }
                
            }
            
        }
        
    }
    
}
