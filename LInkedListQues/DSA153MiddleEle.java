import java.util.*;
public class DSA153MiddleEle {
    
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
        }
    }
    public void Insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;

        }
        cur.next=node;
    }
    public Node middleNode(Node head) {
        Node rabbit=head;
        Node tor=head;
        while(rabbit!=null && rabbit.next!=null){
            rabbit=rabbit.next.next;
            tor=tor.next;
        }
        return tor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DSA153MiddleEle ll=new DSA153MiddleEle();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        ll.Insert(sc.nextInt());
        }
        //ll.print();
        Node Middle=ll.middleNode(ll.head);
        System.out.println(Middle.data);
    }
}