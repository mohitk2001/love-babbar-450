import java.util.*;

class Node{
   int data;
   Node left;
   Node right;
   public Node(int data){
    this.data=data;
    right=null;
    left=null;
   }

}
public class FindLeafOfTree {
    public static Scanner sc=new Scanner(System.in);
    public static Node createTree(){
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1){
            return  null;
        }
        Node curNode=new Node(data);
        System.out.println("Enter left for "+data);
        curNode.left=createTree();
        System.out.println("Enter right for "+data);
        curNode.right=createTree();
        return curNode;
    }
    public static void printTree(Node root){
        if(root==null)
            return  ;
        System.out.println(root.data+" ");
        System.out.print("/");
        printTree(root.left);
        System.out.print("'\'");
        printTree(root.right);
    }
    public static boolean isLeaf(Node root){
       return root.left==null ? root.right==null: false;
    }
    public static void LeafNode(Node root){
        if(root==null){
            return;
        }
        if(isLeaf(root)){
            System.out.print(root.data);
        }
       LeafNode(root.left);
       LeafNode(root.right);
    }
    public static void main(String [] args) {
        Node root=createTree();
        // printTree(root);
        LeafNode(root);
    }
}
