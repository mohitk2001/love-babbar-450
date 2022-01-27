import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Lixicographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        sc.nextLine();
        while(t-->0){
            String p=sc.nextLine();
            String s=sc.nextLine();
            ArrayList<Integer> index=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                for(int j=0;j<p.length();j++){
                    if(s.charAt(i)==p.charAt(j)){
                        index.add(j);
                    }
                }          
            }
            Collections.sort(index);
            for(int x:index){
                System.out.print(p.charAt(x));
            }
            System.out.println();
        }
    }
}
