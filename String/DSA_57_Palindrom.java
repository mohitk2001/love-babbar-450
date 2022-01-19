import java.util.Scanner;

public class DSA_57_Palindrom {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        String n=new String(str.reverse());
        if(s.equals(n)){
            System.out.print("String is Palindrome");
        }
        else{
            System.out.print("String is not Palindrome");
        }
    }
}
