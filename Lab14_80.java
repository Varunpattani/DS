class Node{
        int info;
        Node lpter;
        Node rpter;

        public Node(int data){
            this.info = data;
            this.lpter = null;
            this.rpter = null; 
        }
}
class BST{
    Node root = null;

    public boolean isSymmetric(Node root) {
        return sym(root.lpter,root.rpter);  
    }
    public boolean sym(Node a,Node b){
        if(a == null && b == null) return true;
        if(a != null && b != null && a.info == b.info){
            return sym(a.lpter,b.rpter) && sym(a.rpter,b.lpter);
        }
        return false;
    }
    public void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.info + " ");
        preOrder(root.lpter);
        preOrder(root.rpter);
    }
}
public class Lab14_80{
    public static void main(String[] args) {
        BST tree1 = new BST();
        tree.root = new Node(8);
        tree.root.lpter = new Node(5);
        tree.root.lpter.lpter = new Node(3);
        tree.root.lpter.rpter = new Node(6);
        tree.root.rpter = new Node(5);
        tree.root.rpter.lpter = new Node(6);
        tree.root.rpter.rpter = new Node(3);
        
        if(tree.isSymmetric(tree.root)){
            System.out.println("Symmetric");
        }
        else System.out.println("Not Symmetric");
        

    }
}