import java.util.Scanner;

public class AddStringandInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputValue=sc.nextLine();
        String[] numbers=inputValue.split(",");
        int iOf4=-1;
        int iOf7=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equals("7"))
                iOf7=i;
            else if(numbers[i].equals("4")){
                iOf4=i;
            }
        }
        int exclude=0;
        for(int i=0;i<iOf4;i++){
            exclude=exclude+Integer.parseInt(numbers[i]);
        }
        for(int j=iOf7+1;j<numbers.length;j++){
            exclude=exclude+Integer.parseInt(numbers[j]);
        }
        String include="";
        for(int i=iOf4;i<=iOf7;i++){
            include=include+numbers[i];
        }
        System.out.println(exclude+Integer.parseInt(include));
    }
}
