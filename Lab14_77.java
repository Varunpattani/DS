class BST{
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
     Node root = null;

    public Node insertRecord(Node root,int n){
        if(root == null){
            root = new Node(n);
            return root;
        }
        if(n<root.info){
            root.lpter = insertRecord(root.lpter, n);
        }
        else{
            root.rpter = insertRecord(root.rpter, n);
        }
        return root;
    }
    
    public void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.info + " ");
        preOrder(root.lpter);
        preOrder(root.rpter);
    }
    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.lpter);
        System.out.println(root.info + " ");
        inOrder(root.rpter);
    }
    public void postOrder(Node root){
        if(root == null) return;
        postOrder(root.lpter);
        postOrder(root.rpter);
        System.out.println();
        System.out.println(root.info + " ");
    }
    public Node search(Node root,int key){
        if(root == null || root.info == key) return root;
        if(root.info < key){
            return search(root.rpter,key);
        }
        return search(root.lpter,key);
    }
    public Node delete(Node root,int key){
        if(root == null) return root;
        if(key>root.info){
            root.rpter = delete(root.rpter, key);
        }
        else if(key<root.info){
            root.lpter = delete(root.lpter, key);
        }
        else{
            if(root.info == key){
                if(root.lpter == null){
                    return root.rpter;
                }
                else if(root.rpter==null){
                    return root.lpter;
                }
                else{
                    Node save = root.rpter;
                    while(save!=null && save.lpter!=null){
                        save = save.lpter;
                    }
                    if(save!=null){
                        root.info = save.info;
                    }
                    root.rpter = delete(root.rpter, key);
                    return root;
                }
            }
         }
        return root;

        
    }
    
}
public class Lab14_77{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insertRecord(bst.root, 50);
        bst.root = bst.insertRecord(bst.root, 40);
        bst.root = bst.insertRecord(bst.root, 60);
        bst.root = bst.insertRecord(bst.root, 80);
        bst.root = bst.insertRecord(bst.root, 20);
        bst.root = bst.insertRecord(bst.root, 10);
        bst.root = bst.insertRecord(bst.root, 30);
        
        
        bst.postOrder(bst.root);
        System.out.println(bst.search(bst.root, 80)!=null ? "FOUND":"NOT FOUND");
        bst.delete(bst.root, 60);
        bst.postOrder(bst.root);
    }
}
