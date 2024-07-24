import java.util.Scanner;

public class Lab10_56{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data:");
		int num = sc.nextInt();
		
		Node n1 = new Node(num);
		System.out.println("Node="+n1.data);
	}
}
class Node{
	int data;
	Node link;

	public Node(int n){
		this.data=n;
		this.link=null;
	}
}