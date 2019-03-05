package hashsetlargestvalue;

import java.util.Scanner;
import java.util.HashSet;

public class HashSetLargestValue {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet();
        
        int i, j;
        int enter;
        int largestValue = 0;
        
        for(i = 0; i < 5; i++){
            
            System.out.print("Enter a number to " + (i + 1) + " position: ");
            enter = scanner.nextInt();
            
            hashSet.add(enter);
            
            Integer[] vetor = new Integer[hashSet.size()];
            hashSet.toArray(vetor);
            
            if(vetor[i] > largestValue){
                largestValue = vetor[i];
            }
                                   
        }
        
        System.out.println("The largest number is: " + largestValue);
        
    }
    
}
