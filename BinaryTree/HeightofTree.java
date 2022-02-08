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
    
    
    public class HeightofTree {
        public static Scanner sc=null;
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
        public static int heightOf(Node root){
            if(root==null){
                return 0;
            }
            return Math.max(heightOf(root.left) , heightOf(root.right))+1;
        }
        public static void main(String[] args) {
             sc=new Scanner(System.in);
            Node root=createTree();
            int returnedHeight=heightOf(root);
            System.out.println(returnedHeight);
        }
    }
    
