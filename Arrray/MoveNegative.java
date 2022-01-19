import java.util.*;
public class MoveNegative {
    public static void rearrange(int arr[]){
        int temp=0;
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                
                if(i!=j){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        System.out.print(arr[k]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        rearrange(arr);
        sc.close();
    }
    
}
