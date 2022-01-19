import java.util.*;
public class DSA11Array {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       HashSet<Integer> hash=new HashSet<>();
       for(int i=0;i<n;i++)
       hash.add(a[i]);
       for(int j=0;j<m;j++)
       hash.add(b[j]);
       return hash.size();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int asize=sc.nextInt();
        int bsize=sc.nextInt();
        int []arr=new int[asize];
        int []barr=new int[bsize];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<barr.length;i++){
            arr[i]=sc.nextInt();
        }
        int union=doUnion(arr,asize,barr,bsize);
        System.out.print(union);
        sc.close();
    }
}
