import java.util.Scanner;
public class Lab10_58{
	class Node{
		int data;
		Node link;

		public Node(int n){
			this.data = n;
			this.link = null;
		}
	}
	public Node first = null;
	public Node last = null;
	public  void insertAtFirst(int n){
		Node temp=new Node(n);
		if(first==null){
			first=temp;
			last=temp;
			first.link = first;
		}
		else{
			temp.link=first;
			first = temp;
			last.link=first;
		}  
	}
	public void display(){
		System.out.print("Linked list = ");
		if(first.link==first){
			System.out.println(first.data+" => ");
		}
		else{
			System.out.print(first.data+" => ");
			Node dis = first.link;
		    while(dis.link!=first.link){
		    	System.out.print(""+dis.data+" => ");
		    	dis=dis.link;
		    }
		    System.out.println();
	    }

	}
	public void insertAtLast(int n){
		Node temp=new Node(n);
		if(first==null){
			first=temp;
			last=temp;
			first.link = first;
		}
		else{
			last.link = temp;
			last = temp;
			last.link = first;
		}  
	}
	public void count(){
		int c = 1;
		if(first==first.link){
			System.out.println("Count = 1");
			return;
		}
		else{
			Node dis = first.link;
			while(dis.link!=first.link){
			   System.out.println("hi");
			   dis=dis.link;
			   c++;
		    }
		    System.out.println("Count = "+c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0,n = 0;
		Lab10_58 cl = new Lab10_58();
		while(num!=5){
			System.out.println("Enter 1 for InsertAtFirst:");
			System.out.println("Enter 2 for display:");
			System.out.println("Enter 3 for InsertAtLast:");
			System.out.println("Enter 4 for count:");
			System.out.println("Enter 5 for END:");
			
			num = sc.nextInt();

			switch(num){
			case 1:
				System.out.println("Enter number:");
				n = sc.nextInt();
				cl.insertAtFirst(n);
				break;
				
			case 2:
				cl.display();
				break;
				
			case 3:
				System.out.println("Enter number:");
				n = sc.nextInt();
				cl.insertAtLast(n);
				break;
				
			case 4:
				cl.count();
				break;

			case 5:
				break;
			}

		}
	}
}