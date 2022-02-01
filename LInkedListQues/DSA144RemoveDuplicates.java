import java.util.*;
public class DSA144RemoveDuplicates {
    
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
    Node removeDuplicates(Node head)
    {
	// Your code here
    	if(head==null)
    	return null;
    	Node cur=head;
    	while(cur.next!=null){
	        if(cur.data==cur.next.data){
	            cur.next=cur.next.next;
	        }
	        else
	        cur=cur.next;
	    }
	    return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DSA144RemoveDuplicates ll=new DSA144RemoveDuplicates();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        ll.Insert(sc.nextInt());
        }
        //ll.print();
        Node dup=ll.removeDuplicates(ll.head);
        ll.print(dup);
    }
}