public class Lab11_61{
	public static void main(String[] args) {
		Singly s = new Singly();
		s.enque(1);
		s.enque(2);
		s.enque(3);
		s.deque();
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
	
    public void enque(int n){
    	Node save = new Node(n);
    	if(first == null){
    		first = save;
    		last = save;
    		return;
    	}
    	last.link = save;
    	last = save;
	}
	public void deque(){
		if(first == null){ 
			System.out.println("Queue underflow");
			return;
		}
		else if(first.link == null){
			first = null;
			last = null;
			return;
		}
		first = first.link;
	}
	public void display(){
		if(first == null){
			System.out.println("Queue underflow");
			return;
		}
		Node save = first;
		System.out.print("Queue = ");
		while(save!=null){
			System.out.print(save.info+"=>");
			save = save.link;
		}
	}
}