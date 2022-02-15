import java.util.Scanner;


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}

public class SearchInBT {

    public static Scanner sc=null;
    public static Node CreateTree(){
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter left for "+data );
        root.left=CreateTree();
        System.out.println("Enter right for "+data );
        root.right=CreateTree();
        return root;
    }
    public static void PrintTree(Node root){
        if(root==null){
            return ;
        }

        PrintTree(root.left);
        System.out.print(root.data+" ");
        PrintTree(root.right);
    }
   public static boolean Search(Node root,int data){
    if(root==null){
        return false;
    }
    if(root.data==data)
    return true;
    if(root.data>data){
        return Search(root.left,data);
    }
    
    return Search(root.right, data);
   }
    public static void main(String[] args) {
     sc=new Scanner(System.in);
       Node root= CreateTree();
       PrintTree(root);
       System.out.println("Enter you data to be search in BT");
       int d=sc.nextInt();
       if(Search(root,d)){
           System.out.println("Element present");
       }
       else{
           System.out.println("Element does not present");
       }
    }
}
