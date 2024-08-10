import java.util.Scanner;
public class Lab9_50{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Queue");
		int size = sc.nextInt();
		
		Que q = new Que(size);
		
		int num = 0;
		while(num!=4){
			System.out.println("For Enque 1:");
			System.out.println("For Deque 2:");
			System.out.println("For Display 3:");
			System.out.println("For End 4:");
			num = sc.nextInt();

			switch(num){
			case 1:
				System.out.println("Enter number:");
				int n = sc.nextInt();
				q.enque(n);
				break;

			case 2:
				q.deque();
				break;

			case 3:
				q.display();
				break;

			case 4:
				break;
			}
		}
	}
}
class Que{
	int[] Q;
	int f;
	int r;
	int n;
	public Que(int n){
		this.n = n;
		this.f = -1;
		this.r = -1;
		Q = new int[n];
	}
	public void enque(int num){
		if(r >= n-1){
			System.out.println("Queue overflow");
			return;
		}
		Q[++r] = num;
		if(f == -1) f++;
	}
	public void deque(){
		if(f == -1 || f>r){
			System.out.println("Stack underflow");
			return;
		}
		Q[f] = 0;
		f++;
		if(f==r) f=r=-1;
	}
	public void display(){
		System.out.print("Queue= ");
		for(int i=f;i<=r;i++){
			System.out.print(Q[i]+" ");
		}
		System.out.println();
	}
}
