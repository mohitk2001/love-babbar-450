//reverse after removal of dublicates 
import java.util.*;
public class ReverseRemoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        LinkedHashSet<Character> tset=new LinkedHashSet<>();
        for(int i=0;i<word.length();i++){
           tset.add(word.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        Iterator itr=tset.iterator();
        while(itr.hasNext()){
            sb.append(itr.next().toString());
        }
        System.out.println(sb.reverse());
    }
}
