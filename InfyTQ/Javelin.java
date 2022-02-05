import java.security.KeyStore.Entry;
import java.util.*;

public class Javelin {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int player=sc.nextInt();
    TreeMap<Integer,String> map=new TreeMap<Integer,String>(Collections.reverseOrder()); 
    while(player-->0){
        String name=sc.next();
        int chanches[]=new int[5];
        for(int i=0;i<5;i++)
        chanches[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<chanches.length;i++){
            max=Math.max(max,chanches[i]);
        }
        map.put(max,name);
    }
    System.out.println(map);
    for(Map.Entry m:map.entrySet()){
        System.out.println("Score--"+m.getKey() +"->"+m.getValue());
    }
 }   
}
