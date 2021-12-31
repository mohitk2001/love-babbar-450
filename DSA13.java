import java.io.*;
public class DSA13 {
    
	public static void main (String[] args) throws IOException {
}
class Solution{

   
    long maxSubarraySum(int arr[], int n){
        long max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = arr[i];
            if(max < sum){
                max = sum;
            }
            for(int j = i + 1; j < n; j++){
                sum = sum + arr[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
    
}


}
