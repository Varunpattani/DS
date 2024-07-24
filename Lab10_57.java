import java.util.Scanner;
public class Lab10_57{
	public static void main(String[] args) {
		Singly s = new Singly();
		Scanner sc = new Scanner(System.in);
		int num=0,n=0;
		while(num!=7){
			System.out.println("Enter 1 for InsertAtFirst:");
			System.out.println("Enter 2 for display:");
			System.out.println("Enter 3 for DeleteAtFirst:");
			System.out.println("Enter 4 for InsertAtLast:");
			System.out.println("Enter 5 for DeleteAtLast:");
			System.out.println("Enter 6 for DeleteAtPosition:");
			System.out.println("Enter 7 for END:");
			num = sc.nextInt();

			switch(num){
			case 1:
				System.out.println("Enter number:");
				n = sc.nextInt();
				s.insertAtFirst(n);
				break;
			
			case 2:
				s.display();
				break;
			
			case 3:
				s.deleteAtFirst();
				break;
			
			case 4:
				System.out.println("Enter number:");
				n = sc.nextInt();
				s.insertAtLast(n);
				break;
			
			case 5:
				s.deleteAtLast();
				break;
			
			case 6:
				System.out.println("Enter location:");
				n = sc.nextInt();
				n--;
				s.delete(n);
				break;
			
			case 7:
				break;
			}

		}


	}
}
class Singly{
	public class Node{
		int data;
		Node link;

		public Node(int data){
			this.data = data;
			this.link=null;
		}
	}
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
	public void deleteAtFirst(){
		
		if(first==null){
			return;
		}
		else{
			first=first.link;
		}  
	}
	public void deleteAtLast(){
		Node save = first;
		if(first==null){
			return;
		}
		else{
			while(save.link!=last){
				save=save.link;
			}
			last = save;
			last.link=null;

		}  
	}
	public void delete(int n){
		int num = 0;
		Node pre = null;
		Node save = first;
		if(n==0){
			first=first.link;
			return;
		}
		while(num!=n){
			pre = save;
			save = save.link;
			num++;
		}
		pre.link=save.link;
	}
	public void insertAtFirst(int n){
		Node temp=new Node(n);
		if(first==null){
			first=temp;
			last=temp;
		}
		else{
			temp.link=first;
			first = temp;
		}  
	}
	public void display(){
		Node dis = first;
		System.out.print("Linked list = ");
		while(dis!=null){
			System.out.print(""+dis.data+" => ");
			dis=dis.link;
		}
		System.out.println();

	}
}