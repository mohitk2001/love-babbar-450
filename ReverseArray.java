/**
 * ReverseArray
 */
import java.util.*;
public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        int start=0,end=arr.length-1;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}