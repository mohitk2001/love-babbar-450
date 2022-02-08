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
    
    
    public class DiameterOfTree {
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            return Math.max(height(root.left), height(root.right)) +1;
        }
        public static int DiameterOf(Node root){
            if(root==null){
                return 0;
            }
            int Diameter1=DiameterOf(root.left);
            int Diameter2=DiameterOf(root.right);
            int Diameter3=height(root.left) + height(root.right)+1;
            return Math.max(Diameter3, Math.max(Diameter1, Diameter2));
        }
        public static void main(String[] args) {
             sc=new Scanner(System.in);
            Node root=createTree();
            int returnedDiameter=DiameterOf(root);
            System.out.println(returnedDiameter);
        }
    }
    
