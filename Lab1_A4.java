import java.util.Scanner;

public class Lab1_A4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int x=sc.nextInt();

		int a=1;
		for(int i=1;i<=x;i++){
			a*=i;
		}
		System.out.println("Factorial="+a);
	}
}