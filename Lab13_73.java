public class Lab13_73{
	public static void main(String[] args) {
		Doubly d = new Doubly();
		d.insertAtLast(1);
		d.insertAtLast(2);
		d.insertAtLast(3);
		d.insertAtLast(4);
		d.insertAtLast(5);
		d.deleteAlt();
		d.display();
	}
}
class Doubly{
	class Node{
		int info;
		Node lpter;
		Node rpter;
		public Node(int n){
			this.info = n;
			this.lpter = null;
			this.rpter = null;
		}
	}
	Node first = null;
	Node last = null;
	public void insertAtLast(int n){
		Node temp = new Node(n);
		if(first == null){
			first = temp;
			last  = temp;
		}
		else{
			last.rpter = temp;
			temp.lpter = last;
			last = temp;
		}
	}
	public void display(){
		System.out.print("Doubly linked List = ");
		Node temp = first;
		while(temp!=null){
			System.out.print(temp.info + " => ");
			temp = temp.rpter;
		}
		System.out.println();
	}
	public void deleteAlt(){
		Node save = first;
		int count = 1;
		while(save!=null){
			if(count%2 == 0){
				save.lpter.rpter = save.rpter;
				if(save.rpter!=null){
					save.rpter.lpter = save.lpter;
				}
				else save.rpter = null;
			}
			count++;
			save = save.rpter;
		}
	}
}