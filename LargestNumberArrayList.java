package largestnumberarraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class LargestNumberArrayList {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> arrayList = new ArrayList();
       
       int i;
       int enter;
       int largestValue = 0;
       
       for(i = 0; i < 5; i++){
           
           System.out.print("Enter a value: ");
           enter = scanner.nextInt();
           
           arrayList.add(enter);
           
           if(arrayList.get(i) > largestValue){
               largestValue = arrayList.get(i);
           }
                      
       }
       
       System.out.println("The largest value is: " + largestValue);
       
    }
    
}
