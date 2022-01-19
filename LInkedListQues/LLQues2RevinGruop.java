import java.util.Scanner;
/**
 * LLQues2RevinGruop
 */
public class LLQues2RevinGruop {
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
    public void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public Node  reverseByGroup(Node head,int k){
        Node cur=head;
        int i=0;
        Node prev=null;
        while(cur!=null && i<k ){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LLQues2RevinGruop ll=new LLQues2RevinGruop();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        ll.Insert(sc.nextInt());
        }
        //ll.print();
        Node rev=ll.reverseByGroup(ll.head,sc.nextInt());
        ll.print(rev);
    }
}