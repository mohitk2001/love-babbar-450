import java.util.*;
public class LongestUniqueSubString {
    public static boolean isUnique(String s){
        HashSet<Character> hset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hset.add(s.charAt(i));
        }    
        if(hset.size()==s.length()){
            return true;
        }
        else
            return false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	String ans="";
    	for(int i=0;i<str.length()-1;i++){
        	for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                if(s.length()>=3 && isUnique(s)){
                    if(s.length()>=ans.length()){
                        ans=s;
                    }
            	}
        	}
    	}
        if(ans.length()==0){
            System.out.println(-1);
        }
        else
        System.out.println(ans);
    }
}
