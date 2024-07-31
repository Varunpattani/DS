public class Lab12_63{
	public static void main(String[] args) {
		Singly s1 = new Singly();
		s1.insertAtLast(1);
		s1.insertAtLast(2);
		s1.insertAtLast(3);
		s1.display();
		Singly s2 = new Singly();
		s2.copy(s1,s2);
		s2.display();
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
	public void copy(Singly s1,Singly s2){
		Node save = s1.first;
		while(save!=null){
			if(s2.first == null){
				s2.first = save;
				s2.last = save;
			}
			else{
				s2.last.link = save;
				s2.last = save;
			}
			save = save.link;
		}

	}
}