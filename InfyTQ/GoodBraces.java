import java.util.Scanner;
import java.util.Stack;

public class GoodBraces {
    public static boolean isOpenBracket(char ch){
        return ch=='(' || ch=='{' ||ch=='[';
    }

    public static boolean isCombo(char a,char b){
        return a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']'; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();
        int counter=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char cur=exp.charAt(i);
            if(isOpenBracket(cur)){
                stack.push(cur);
                counter++;
            }
            else {
                if(stack.isEmpty()){
                    System.out.print(counter+1+" stack is emp");
                    return ;
                }
                else if(isCombo(stack.peek(),cur)){
                    counter++;
                    stack.pop();
                }
            }
            
        }
        if(stack.isEmpty()){
            System.out.println("Balanced ->" + 0);
        }
        else{
            System.out.println(counter+1);
        }
    }
}
