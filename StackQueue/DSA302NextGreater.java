import java.util.*;
public class DSA302NextGreater {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        long ans[]=new long[arr.length];
        Stack<Long> st=new Stack<Long>();
        for(int i=ans.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i] ){
                st.pop();
        }
        if(st.isEmpty()){
            ans[i]=-1;
            st.push(arr[i]);
        }
        
        else if(st.peek()>arr[i]){
            ans[i]=st.peek();
            st.push(arr[i]);
        }
        }
        return ans;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int size=sc.nextInt();
            long []arr=new long[size];
            for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
            long res[]=nextLargerElement(arr,size);
            for(int i=0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
        }
    }
}
