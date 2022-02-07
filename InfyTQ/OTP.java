/**
 * OTP
 */
import java.util.*;
public class OTP {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                list.add(str.charAt(i));
            }
        }
        Iterator itr=list.iterator();
        String ans="";
        for(int i=0;i<list.size();i++){
            ans=ans+(int)Math.pow(Character.getNumericValue(list.get(i)),2);
        }
        // int ans=Character.getNumericValue(list.get(0));
         System.out.println(ans.substring(0,4));
    }
}