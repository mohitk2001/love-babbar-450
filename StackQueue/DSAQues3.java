/**
 * DSAQues3
 */
import java.util.*;
class UserStack{
    int size=5;
    int top1=-1,top2=size;
    int arr[]=new int[size];
}
public class DSAQues3 {
    public static void push1(int n,UserStack ust){
        if(ust.top1==ust.top2-1){
            System.out.println("1 Array is Full Now");
            return;
        }
        ust.top1++;
        ust.arr[ust.top1]=n;
    }
    public static void push2(int n,UserStack ust){
        if(ust.top1==ust.top2-1){
            System.out.println("2 Array is Full Now");
            return;
        }
        ust.top2--;
        ust.arr[ust.top2]=n;
        
    }
    public static void pop1(UserStack ust){
        if(ust.top1==-1){
            System.out.println("EMpty " +-1);
            return ;
        }
        System.out.println(ust.arr[ust.top1--]);
    }
    public static void pop2(UserStack ust){
        if(ust.top2==ust.top1){
            System.out.println("Empty " +-1);
            return ;
        }
        if(ust.top2>ust.size-1){
            System.out.println("Index Bound "+-1);
            return ;
        }
        System.out.println(ust.arr[ust.top2++]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();
        UserStack ust=new UserStack();
        st1.push(2);
        st1.push(3);
        st1.push(5);
        st2.push(4);
        st2.push(10);
        //Now calling method
        push1(st1.pop(),ust);
        push1(st1.pop(),ust);
        push1(st1.pop(),ust);
        push2(st2.pop(),ust);
        push2(st2.pop(),ust);
        // Now popping 
        pop1(ust);
        pop1(ust);
        pop1(ust);
        pop2(ust);
        pop2(ust);
        pop1(ust);
        pop2(ust);
        sc.close();
        // for(int i=0;i<ust.arr.length;i++){
        //     System.out.print(" "+ust.arr[i]+" ");
        // }
    }
}