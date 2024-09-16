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
    Node root1 = null;
    Node root2 = null;

    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.info!=q.info ) return false;
        return isSameTree(p.lpter,q.lpter) && isSameTree(p.rpter,q.rpter); 
    }}
public class Lab14_79{
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root1 = new Node(3);
        tree.root1.lpter = new Node(2);
        tree.root1.lpter.rpter = new Node(1);
        tree.root1.rpter = new Node(4);
        
        tree.root2 = new Node(3);
        tree.root2.lpter = new Node(5);
        tree.root2.lpter.rpter = new Node(1);
        tree.root2.rpter = new Node(4);
        
        if(tree.isSameTree(tree.root1,tree.root2)){
            System.out.println("Given trees are same");
        }
        else System.out.println("Given trees are not same");
        

    }
}