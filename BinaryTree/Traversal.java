import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data=d;
        left=null;
        right=null;
    }
}
public class Traversal {
    static Scanner sc=null;
    public static Node createTree(){
       Node root=null;
       System.out.print("Enter data ");
       int data=sc.nextInt();
       if(data==-1){
           return null;
       }
       root=new Node(data);
       System.out.println("For left for " + data  );
       root.left=createTree();
       System.out.println("For right "+data );
       root.right=createTree();
        return root;
    }
    public static void main(String[] args) {
         sc=new Scanner(System.in);
        Node root=createTree();
        System.out.println(root.data);
        PrintTree(root);
    }
    public static void PrintTree(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        PrintTree(root.left);
        PrintTree(root.right);
    }
}
