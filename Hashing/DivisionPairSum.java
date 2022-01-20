public class DivisionPairSum {
    public static void main(String[] args) {
        int a[]={10,9,4,5,7,2,8,20,21};
        int sum=0;
        int k=15;
        int countPair=0;
       //Brute force
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         sum=a[i]+a[j];
        //         if(sum%k==0){
        //             countPair++;
        //         }
        //     }
        // }
        System.out.print(countPair);
    }
}
