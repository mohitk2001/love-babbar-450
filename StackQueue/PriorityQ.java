import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(19);
        pq.add(15);
        pq.add(16);

        //System.out.print(pq);
        Iterator itr=pq.iterator();
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
