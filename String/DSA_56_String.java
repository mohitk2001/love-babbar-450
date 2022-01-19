import java.util.*;

/**
 * DSA_56_String
 */
public class DSA_56_String {
    public static void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<(s.length/2);i++,j--){
            char temp=s[j];
             s[j]=s[i];
            s[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char []ch=new char[8];
        for(int i=0;i<ch.length;i++)
        ch[i]=sc.next().charAt(0);
        reverseString(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}