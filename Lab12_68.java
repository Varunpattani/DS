public class Lab12_68{
	public static void main(String[] args) {
		Singly s = new Singly();
		s.insertAtLast(1);
		s.insertAtLast(2);
		s.insertAtLast(3);
		s.insertAtLast(4);
		s.insertAtLast(5);
		s.insertAtLast(6);
		s.insertAtLast(7);
		s.insertAtLast(8);
		s.swapPair(s);
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
	public void swapPair(Singly s){
		Node dummy = new Node(0);
		dummy.link = s.first;
		
		Node point = dummy;

		while(point.link!=null && point.link.link!=null){
			Node swap1 = point.link;
			Node swap2 = point.link.link;

			swap1.link = swap2.link;
			swap2.link = swap1;

			point.link = swap2;
			point = swap1;
		}
		first = dummy.link;
	}
}