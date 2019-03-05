package hashmaplargestvalue;

import java.util.Scanner;
import java.util.HashMap;

public class HashMapLargestValue {

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> hashMap = new HashMap();
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int value;
        int largestValue = 0;
        int position;
        
        for(i = 0; i < 5; i++){
            
            System.out.print("Type position: ");
            position = scanner.nextInt();
            
            System.out.print("Type value: ");
            value = scanner.nextInt();
            
            hashMap.put(position, value);
            
            if(hashMap.get(position) > largestValue){
                largestValue = hashMap.get(position);
            }
            
        }
        
        System.out.println("The largest value is: " + largestValue);
        
    }
    
}
