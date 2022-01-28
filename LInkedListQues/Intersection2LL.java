import java.util.*;

class Node {
    
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class Intersection2LL {
    public static Node Insert(int[] arr,Node h){
        for(int i=0;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            if(h==null){
                h=newNode;
            }
            else{
                Node cur=h;
                while(cur.next!=null){
                    cur=cur.next;
                }
                cur.next=newNode;
            }
        }
        return h;
    }
    public static void main(String [] args){
        int []A={10,20,40,50,70,80};
        int []B={15,40,50,60,80};
        Node head1=null;
        head1=Insert(A,head1);
        //PrintLL(head1);
        Node head2=null;
        head2=Insert(B,head2);
        //PrintLL(head2);
        Node intersection=findIntersection(head1, head2);
        PrintLL(intersection);
    }
    public static void PrintLL(Node I){
        Node curNode=I;
        while(curNode!=null){
            System.out.print(curNode.data+" ");
            curNode=curNode.next;
        }
        System.out.println();
    }
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node cur1 = head1, cur2 = head2;
        Node temp = null;
        while (cur1!= null && cur2!= null) {
            if (cur1.data == cur2.data) {
                Node newNode = new Node(cur1.data);
                if (temp == null) {
                    temp = newNode;
                } else {
                    Node c = temp;
                    while (c.next!= null) {
                        c = c.next;
                    }
                    c.next = newNode;
                }
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            else if (cur1.data < cur2.data) {
                cur1 = cur1.next;
               //System.out.println("1");
            } 
            else if (cur2.data < cur1.data) {
                cur2 = cur2.next;
                //System.out.println("2");
            }
        }
        return temp;
    }
}

