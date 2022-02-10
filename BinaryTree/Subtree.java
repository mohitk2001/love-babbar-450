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
    
    
    public class Subtree {
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
        public static Node createSubTree(){
            System.out.println("Enter data -- (subtree) ");
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
        public static boolean isIdentical(Node tree,Node subtree){
            if(tree==null && subtree==null){
                return true;
            }
            if(tree==null || subtree==null){
                return false;
            }
            if(tree.data==subtree.data){
                return isIdentical(tree.left, subtree.left) && isIdentical(tree.right, subtree.right);
            }
            return false;
        }
       public static boolean isThereSubTree(Node tree,Node subtree){
           if(subtree==null){
               return true;
           }
           if(tree==null){
               return false;
           }
           if(isIdentical(tree,subtree)){
                return true;
           }
           return isThereSubTree(tree.left, subtree.left) || isThereSubTree(tree.right, subtree.right) ;
       }
        public static void main(String[] args) {
             sc=new Scanner(System.in);
            Node mainTree=createTree();
            Node subTree=createSubTree();

           boolean isIt= isThereSubTree(mainTree,subTree);

           if(isIt){
               System.out.print("Yes second tree is subtree of main tree");
           }
           else
           System.out.println("Nope its not");
        }
    }
    
