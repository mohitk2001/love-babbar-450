import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
}


public class CountNodes {
    public static Scanner sc=null;
    public static int count=0;
    public static Node createTree(){
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1)
        return null;
        Node node=new Node(data);
        System.out.println("Enter left data for "+data);
        node.left=createTree();
        System.out.println("Enter right data for "+data);
        node.right=createTree();

        return node;
    }


    public static void PrintNode(Node root){
        if(root==null){
            return ;
        }
        else {
            count++;
        }
        //System.out.println(root.data+" ");
        PrintNode(root.left);
        PrintNode(root.right);
    }
    public static int counterNode(Node root){
        if(root==null){
            return 0;
        }
        return counterNode(root.right) + counterNode(root.left) +1;
    }
    public static void main(String[] args) {
         sc=new Scanner(System.in);
        Node root=createTree();
        PrintNode(root);
        System.out.println(count);
        int returnedCount=counterNode(root);
        System.out.println(returnedCount);
    }
}
