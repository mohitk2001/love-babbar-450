import java.util.*;
public class OptimizeSubstr {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
        HashSet<Character> hset=new HashSet<>();
        String maxtillNow="";
        String maxOverall="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hset.contains(c)){
                hset.clear();
                maxtillNow="";
            }
            hset.add(c);
            maxtillNow+=c;
            if(maxtillNow.length()>maxOverall.length()){
                maxOverall=maxtillNow;
            }
        }
        System.out.print(maxOverall);
    }
}
