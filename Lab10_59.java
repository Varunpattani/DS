import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Singly s1 = new Singly();
        Singly s2 = new Singly();
        
        s1.insertAtLast(2);
        s1.insertAtLast(3);
        s1.insertAtLast(4);
        
        s2.insertAtLast(2);
        s2.insertAtLast(5);
        s2.insertAtLast(4);
         
        boolean flag = check(s1,s2);
        System.out.println("List are same:"+flag);

    }
    public static boolean check(Singly s1,Singly s2){
        Node current1 = s1.first;
        Node current2 = s2.first;
        
        while(current1!=null || current2!=null){
            if(current1.data!=current2.data){
                return false;
            }
            current1=current1.link;
            current2=current2.link;
        }
        return true;
    }
}
 class Node{
        int data;
        Node link;

        public Node(int data){
            this.data = data;
            this.link=null;
        }
    }
class Singly{
    
    Node first=null;
    Node last=null;
    
    public void insertAtLast(int n){
        Node temp=new Node(n);
        if(first==null){
            first=temp;
            last=temp;
        }
        else{
            last.link = temp;
            last = temp;
        }  
    }    
    
}