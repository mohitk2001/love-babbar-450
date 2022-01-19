import java.util.*;
public class DSA12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int value=arr[n-1];
        for(int j=n-1;j>0;j--){
           arr[j]=arr[j-1];
        } 
        arr[0]=value;
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
