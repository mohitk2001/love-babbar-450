import java.util.*;

public class ConvertBase {
    public static int convert(String str,int base,HashMap hmap){
        int ans=0;int index=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)>='A' && str.charAt(i)<='G'){
                ans=ans+(int)hmap.get(str.charAt(i))*((int)Math.pow(base,index++));
            }
            else {
                ans=ans+(str.charAt(i)-'0')*(int)Math.pow(base,index++);
            }
        }
        return ans;
    }
    public static void isSpecial(char c){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        HashMap<Character,Integer> hmap=new HashMap<>();
        hmap.put('A', 10);
        hmap.put('B', 11);
        hmap.put('C', 12);
        hmap.put('D', 13);
        hmap.put('E', 14);
        hmap.put('F', 15);
        hmap.put('G', 16);
        int base=sc.nextInt();
        int answer=convert(input,base,hmap);
        System.out.println(answer);
    }
}

// Input: str = "1100", base = 2 
// Output: 12

// Input: str = "11A", base = 16
// Output: 282

// Input: str = "123",  base = 8
// Output: 83 