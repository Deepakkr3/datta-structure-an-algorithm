import java.util.Scanner;

public class Main {

    public static Node createTree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data");
        Node root=null;
        int data=sc.nextInt();
        if(data==-1){
            return root;
        }
        root=new Node(data);
        System.out.println("enter left of "+data);
         root.left=createTree();
        System.out.println("enter right of "+data);
        root.right=createTree();
        return root;

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }

        preorder(root.left);

        preorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Node root=createTree();
//        preorder(root);
//        System.out.println();
        inOrder(root);
//        System.out.println();
//        postOrder(root);
    }
}