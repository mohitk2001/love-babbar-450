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
    public class DSA177_LevelOrderT {
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
           // System.out.println(root.data);
            PrintTree(root);
        }
        public static void PrintTree(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node cur=q.poll();
                if(cur==null){
                    if(q.isEmpty()){
                        return ;
                    }
                    System.out.println();
                    q.add(null);
                }
                else{
                    System.out.print(cur.data+"---");
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                    if(cur.right!=null){
                        q.add(cur.right);
                    }
                }
                
            }
        }
    }
    
