public class Lab12_64{
	public static void main(String[] args) {
		
	}
}
class Singly{
	class Node{
		int info;
		Node link;
		public Node(int n){
			this.info = n;
			this.link = null;
		}
	}
	Node first = null;
	Node last = null;
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
			System.out.print(""+dis.info+" => ");
			dis=dis.link;
		}
		System.out.println();
	}
	public void reverse(){
		if(first == last || first.link == null){			
			return;
		}
		

	}
}