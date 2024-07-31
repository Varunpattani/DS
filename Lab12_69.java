public class Lab12_69{
	public static void main(String[] args) {
		Singly s = new Singly();
		s.insertAtLast(1);
		s.insertAtLast(1);
		s.insertAtLast(6);
		s.insertAtLast(13);
		s.insertAtLast(13);
		s.insertAtLast(13);
		s.insertAtLast(27);
		s.insertAtLast(27);
		s.check();
		s.display();
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
	public void check(){
		Node save = first;
		Node temp = new Node(0);
		Node next = new Node(0);
		
		while(save!=null){
			temp = save;
			next = save.link;
			
			while(next!=null){
				if(save.info == next.info){
					temp.link = next.link;
				}
				else{
					temp = next;
				}
				next = next.link;
			}
			save = save.link;
		}
	}
}