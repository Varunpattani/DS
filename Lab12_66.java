import java.util.Scanner;

public class Lab12_66{
	public static void main(String[] args) {
		
		Singly s = new Singly();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of list:");
		int size = sc.nextInt();	

		int n = size;
		while(n!=0){
			System.out.println("Enter node");
			int num = sc.nextInt();
			s.insertAtLast(num);
			n--;
		}
		System.out.println("Enter k:");
		int k = sc.nextInt();
		
		s.swapK(k,size);
		s.display();	
	}
}
class Singly{
	class Node{
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
	public void display(){
		Node dis = first;
		System.out.print("Linked list = ");
		while(dis!=null){
			System.out.print(""+dis.data+" => ");
			dis=dis.link;
		}
		System.out.println();
	}
	public void swapK(int k,int n){
		if(n<k){
			System.out.println("Out of range");
			return;
		}
		if(2*k-1 == n) return;

		Node x = first;
		Node x_pre = null;
		
		Node y = first;
		Node y_pre = null;

		for(int i=1;i<k;i++){
			x_pre = x;
			x = x.link;
		}

		for(int i=1;i<n-k+1;i++){
			y_pre = y;
			y = y.link;
		}
		if(x_pre != null) x_pre.link = y;
		if(y_pre != null) y_pre.link = x; 

		Node temp = x.link;
		x.link = y.link;
		y.link = temp;
		if(k == 1) first = y;
		if(k == n) first = x;
	}
}