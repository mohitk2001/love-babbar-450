import java.util.*;

public class Binary_Search {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found=false;
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int low=0,up=arr.length-1;
        while (low <= up) {
            int mid = (low + up) / 2;
           if (arr[mid] == key) {
               System.out.println("Found at index :" + mid);
               found=true;
               break;
           }  else if (key > arr[mid]) {
               low = mid + 1;

           }  else if (key < arr[mid]) {
               up = mid - 1;
           }
           
       }
       if(!found){
           System.out.println("No");
       }
       sc.close();
    }
}
