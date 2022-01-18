import java.util.Scanner;
import java.util.Stack;

public class DSAReverseString_usingStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String s="GeeksforGeeks";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        System.out.print(stack);
        String ans="";
        for(int i=0;i<s.length();i++){
            ans=ans+stack.pop();
        }
       // System.out.println(stack.size());
        System.out.println(ans);
    }
}
