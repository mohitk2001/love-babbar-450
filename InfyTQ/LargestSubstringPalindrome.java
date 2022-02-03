import java.util.*;
public class LargestSubstringPalindrome {
   // enter your program here 
    public static boolean isPalindrome(String str){
        StringBuffer s=new StringBuffer();
        s.append(str);
        s.reverse();
        if(s.toString().equals(str)){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String maxTillNow="";
        String maxOverall="";
        for(int start=0;start<s.length();start++){
            for(int end=start+1;end<=s.length();end++){
                String cur=s.substring(start,end);
                
                if(isPalindrome(cur)){
                    maxTillNow=cur;
                    
                    if(maxTillNow.length()>maxOverall.length()){
                        maxOverall=maxTillNow;
                    }
                }
            }
        }
        System.out.println(maxOverall);
    }
}
