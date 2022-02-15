import java.util.ArrayList;
import java.util.Scanner;

public class GenerateCode {
    //public static ArrayList<String> name=new ArrayList<>();
    //public static ArrayList<Integer> code =new ArrayList<>();
    public static char getThePerfectCode(String str){
        String[] nameAndcode=str.split(":");
        // name.add(nameAndcode[0]);
        String name=nameAndcode[0];
        int length=nameAndcode[0].length();
        int MAX=0;
        for(int i=0;i<nameAndcode[1].length();i++){
            if(Character.getNumericValue(nameAndcode[1].charAt(i))<=length && Character.getNumericValue(nameAndcode[1].charAt(i))>=MAX ){
                MAX=Character.getNumericValue(nameAndcode[1].charAt(i));
            }
        }
        if(MAX==0){
            return 'X';
        }
        else
        return name.charAt(MAX-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String answer="";
        String []nameKeyPair=input.split(",");
       
        for(int i=0;i<nameKeyPair.length;i++){
            answer=answer+getThePerfectCode(nameKeyPair[i]); 
        }
       System.out.println(answer);
    }
}
