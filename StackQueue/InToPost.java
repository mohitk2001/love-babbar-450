import java.util.*;
public class InToPost {
    public static int Prec(char ch){
        switch(ch){
            case '-':
            case '+':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String expresion){
        String result="";
        Stack<Character> st=new Stack<>();
         for(int i=0;i<expresion.length();i++){
            char cur=expresion.charAt(i);
            if(cur=='('){
                st.push(cur);
            }
            else if(Character.isLetterOrDigit(cur)){
                result+=cur;
            }
            else if(cur==')'){
                 while(!st.isEmpty() && st.peek()!='('){
                    result+=st.pop();
                 }
                 st.pop();
            }
            else{
                while(!st.isEmpty() && Prec(cur)<=Prec(st.peek())){
                    result+=st.pop();
                }
                st.push(cur);
            }
         }
        return "";
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));

    }
}
