public class Lab11_60{
	public static void main(String[] args) {
		Singly s = new Singly();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.peek();
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
	public void push(int n){
		Node save = new Node(n);
		if(first == null){
			first = save;
			last = save;
			return;
		}
		last.link = save;
		last = save;
	}
	public void pop(){
		if(first == null){
			System.out.println("Stack underflow");
			return;
		}
		else if(first == last){
			first = null;
			last = null;
			return;
		}
		Node pre = first;
		while(pre.link!=last){
			pre = pre.link;
		}
		pre.link = null;
		last = pre;
	}
	public void peek(){
		if(first == null){
			System.out.println("Stack underflow");
			return;
		}
		else if(first.link == null){
			System.out.println("Top element= "+first.info);
			return;
		}
		System.out.println("Top element= "+last.info);
	}
	public void display(){
		if(first == null){
			System.out.println("Stack underflow");
			return;
		}
		Node save = first;
		while(save!=null){
			System.out.print(save.info+"=>");
			save = save.link;
		}
	}
}