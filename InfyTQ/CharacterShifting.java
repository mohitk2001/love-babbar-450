import java.util.Scanner;

public class CharacterShifting {
    public static  int GETSQR(int n){
        int sq=0;
        while(n!=0){
            int rem=n%10;
            sq=sq+(int)Math.pow(rem, 2);
            n=n/10;
        }
        return sq;
    }
    public static String ShiftChar(String str){
        String []nameNcode=str.split(":");
        int number=Integer.parseInt(nameNcode[1]);
        int getSquare=GETSQR(number);
        if(getSquare%2==0){
            return nameNcode[0].substring(nameNcode[0].length()-(nameNcode[0].length()-2),nameNcode[0].length())+nameNcode[0].substring(2,nameNcode[0].length());
        }
        else{
            return nameNcode[0].substring(1,nameNcode[0].length())+ nameNcode[0].substring(0,1);
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String answer="";
        String []nameKeyPair=input.split(",");
        for(int i=0;i<nameKeyPair.length;i++){
            System.out.println(ShiftChar(nameKeyPair[i]));
        }

    }
}
