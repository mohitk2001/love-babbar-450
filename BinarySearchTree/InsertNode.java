import java.util.Scanner;


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}

public class InsertNode {

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
    public static Node InsertAtEnd(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        if(root.data>data){
            root.left=InsertAtEnd(root.left, data);
        }
        if(root.data<data){
            root.right=InsertAtEnd(root.right, data);
        }
        
        return root;
    }
    public static void main(String[] args) {
     sc=new Scanner(System.in);
       Node root= CreateTree();
       PrintTree(root);
       Node newroot=InsertAtEnd(root,sc.nextInt());
       System.out.println();
       PrintTree(newroot);
    }
}
