public class Lab12_67{
	public static void main(String[] args) {
		Singly s = new Singly();
		s.insertAtLast(18);
		s.insertAtLast(6);
		s.insertAtLast(10);
		s.insertAtLast(3);
		s.gcd(s);
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
	public void gcd(Singly s){
		Node temp = s.first.link;
		Node pre = s.first;
		int gcd = 1;
		while(temp != null){
			for(int i = 1; i<=temp.data && i<=pre.data; i++){
				if(temp.data%i==0 && pre.data%i==0){
					gcd = i;
				}
			}
			Node save = new Node(gcd);
			pre.link = save;
			save.link = temp;
			pre = temp;
			temp = temp.link;
		}
	}
}