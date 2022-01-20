import java.util.*;

public class DSA58_Dublicate_Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<string.length();i++){
            if(hash.containsKey(string.charAt(i))){
                hash.put(string.charAt(i), hash.get(string.charAt(i))+1);
            }
            else{
                hash.put(string.charAt(i), 1);
            }
        }
        for(Map.Entry m:hash.entrySet()){
           if((int)m.getValue() > 1){
               System.out.println(m.getKey()+ "-->" + m.getValue()+" times ");
           }
        }
        sc.close();
    }
}
