import java.util.*;

class ADeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.poll());
        ArrayDeque<Integer> ll=new ArrayDeque<>();
        ll.addFirst(100);
        ll.add(200);
        ll.add(400);
        ll.addLast(1000);
        ll.add(400);
        System.out.println(ll);
    }
}
