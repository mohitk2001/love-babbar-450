/**
 * FreqArray
 */
import java.util.*;
public class FreqArray {

    public static void main(String[] args) {
        int arr[]={11,1,1,1,1,1,1,1,2,2};
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int a:arr){
            if(freq.containsKey(a)){
                freq.put(a,freq.get(a)+1);
            }
            else{
                freq.put(a,1);
            }
        }
        
        System.out.println(freq.keySet());
        for(int i:freq.keySet()){
            System.out.print(freq.get(i)+" ");
        }
        // for(Map.Entry m : freq.entrySet()){    
        //     System.out.println("Element ->"+m.getKey()+" occured "+m.getValue()+" times");    
        //    }
    }
}