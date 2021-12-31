import java.util.*;
public class Selectionsort {
    public static void insertion(int []a){
        for(int i=0;i<a.length;i++){
            int min=a[i];
            int min_index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_index]){
                    min=a[j];
                    min_index=j;

                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
            printArray(a);
        }
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr);
        sc.close();
    }
}
