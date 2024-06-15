import java.util.Scanner;

public class Lab1_A14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1:");
		int m=sc.nextInt();

		System.out.println("Enter number 2:");
		int n=sc.nextInt();

		int x=0;
		for(int i=m;i<=n;i++){
			x+=i;
		}
		System.out.println("Sum="+x);
	}
}