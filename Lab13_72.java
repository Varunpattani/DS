import java.util.Scanner;
public class Lab13_72{
	public static void main(String[] args) {
		Doubly d = new Doubly();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int num = 0;
		while(n!=5){
			System.out.println("Enter 1 for InsertAtFirst:");
			System.out.println("Enter 2 for InsertAtLast:");
			System.out.println("Enter 3 for DeleteAtPosition:");
			System.out.println("Enter 4 for Display:");
			System.out.println("Enter 5 for End:");
			n = sc.nextInt();
			switch(n){
			case 1:
				System.out.println("Enter node:");
				num = sc.nextInt();
				d.insertAtFirst(num);
				break;
				
			case 2:
				System.out.println("Enter node:");
				num = sc.nextInt();
				d.insertAtLast(num);
				break;

			case 3:
				System.out.println("Enter positon:");
				num = sc.nextInt();
				d.delete(num);
				break;

			case 4:
				d.display();
				break;

			case 5:
				break;
			}
		}
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
	public void insertAtFirst(int n){
		Node temp = new Node(n);
		if(first == null){
			first = temp;
			last  = temp;
		}
		else{
			temp.rpter = first;
			first.lpter = temp;
			first = temp;
		}
	}
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
	public void delete(int n){
		if(n == 1){
			if(first.rpter == null){
				first = null;
				return;
			}
			first = first.rpter;
			first.lpter = null;
			return;
		}

		Node save = first;
		int count = 1;
		while(count!=n){
			save = save.rpter;
			count++;
		}
		if(save.rpter!=null){
			save.lpter.rpter = save.rpter;
			save.rpter.lpter = save.lpter;
		}
		else{
			save.lpter.rpter = null;
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
}
