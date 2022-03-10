import java.util.*;
public class NextSmaller {
    static int arr[]={4,8,5,2,25};
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(!st.empty()){
                while(!st.empty() && arr[i]<st.peek()){
                    st.pop();
                }
            }
            ans.add(st.empty()?-1:st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
