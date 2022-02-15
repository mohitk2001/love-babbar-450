import java.util.*;
public class PalindromeLL {
    
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
    public static Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    // public static void PrintEl(Node head){
    //     if(head==null){
    //         return;
    //     }
    //     Node  cur=head;
    //     while(cur!=null){
    //         System.out.print(cur.data+" ");
    //         cur=cur.next;
    //     }
    // }
    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    // public static boolean IsPalindrome(Node head){

    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PalindromeLL ll=new PalindromeLL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        ll.Insert(sc.nextInt());
        }
        Node Middle=ll.middleNode(ll.head);
        //System.out.println(Middle.data);
        Node root=reverse(Middle.next);

        if(IsPalindrome()){
            System.out.println("Yes LL is pal");
        }
        else{
            System.out.println("Nope its not");
        }

    }
}