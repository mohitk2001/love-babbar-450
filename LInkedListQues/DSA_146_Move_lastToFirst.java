import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DSA_146_Move_lastToFirst {
    static Node head;
    public static void insertNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while(cur.next!=null)
        cur=cur.next;

        cur.next=newNode;
        return;

    }
    public static void moveToFirst(){
        if(head==null || head.next==null)
        return;
        Node last=head;
        Node secLast=null;
        while(last.next!=null){
            secLast=last;
            last=last.next;
        }
        secLast.next=null;
        last.next=head;
        head=last;
    }
    public static void printNodes(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        while(size-->0){
            insertNode(sc.nextInt());
        }
        printNodes();
        moveToFirst();
        printNodes();
    }
}
