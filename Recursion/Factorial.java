public class Factorial {
    public static int factorialOf(int n){
        if(n==0)
        return 1;;
        return n*factorialOf(n-1);

        
    }
    public static void main(String[] args) {
        int n=2;
        int fact=factorialOf(n);
        System.out.println(fact);
    }
}
