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
public class LeftView {
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
    public static void FindLeftView(HashMap list,Node root,int level){
        if(root==null){
            return ;
        }
        
        if(list.get(level)==null){
            list.put(level,root.data);
        }
        FindLeftView(list, root.left, level+1);
        FindLeftView(list, root.right, level+1);
        
    }
    public static void LeftViewofTree(Node root){
        HashMap<Integer,Node> list=new HashMap<>();
        FindLeftView(list,root,0);
        for(Map.Entry k:list.entrySet()){
            System.out.print(k.getValue()+" ");
        }
    }
    public static void main(String[] args) {
         sc=new Scanner(System.in);
        Node root=createTree();
        LeftViewofTree(root);
        
    }
    
}
