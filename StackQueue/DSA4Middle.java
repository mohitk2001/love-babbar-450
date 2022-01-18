import java.util.Scanner;

public class DSA4Middle {
    Node top;
    Node mid;
    int count;
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int n) {
            this.data = n;
            next = null;
            prev = null;
        }
    }
    public  void push(int n) {
        Node newNode = new Node(n);
        if (top == null) {
            top=newNode;
            count++;
            mid=newNode;
            return;
        }
        else{
            top.next=newNode;
            newNode.prev=top;
            top=newNode;
            count++;
            if(count%2==0){
                mid=mid.next;
            }
            
        }
    }
    
    public int pop(){
        if(top==null){
            System.out.print("Stack is empty ");
            return -1;
        }
        int ans=top.data;
        top=top.prev;
        count--;
        if(count%2!=0){
            mid=mid.prev;
        }
        return ans;
    }
    public void printStack(Node top){
        Node cur=top;
        if(cur.prev==null){
            System.out.print("Stack is empty");
            return;
        }
        while(cur.prev!=null){
            System.out.print(cur.data+" ");
            cur=cur.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSA4Middle stack=new DSA4Middle();
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        System.out.println("Middle Element is -> "+stack.mid.data);
        System.out.println("Deleted Element is -> "+stack.pop());
        stack.printStack(stack.top);
        System.out.println("Middle Element is -> "+stack.mid.data);
        System.out.println("Deleted Element is -> "+stack.pop());
        stack.printStack(stack.top);
        System.out.println("Middle Element is -> "+stack.mid.data);
        System.out.println("Deleted Element is -> "+stack.pop());
        stack.printStack(stack.top);
        System.out.println("Middle Element is -> "+stack.mid.data);
        System.out.println("Deleted Element is -> "+stack.pop());
        stack.printStack(stack.top);
        System.out.println("Middle Element is -> "+stack.mid.data);
        System.out.println("Deleted Element is -> "+stack.pop());
        stack.printStack(stack.top);
        sc.close();
    }
}
