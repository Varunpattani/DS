import java.util.Scanner;

public class Lab1_A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int x=sc.nextInt();

		int res = fact(x);
		System.out.println("Factorial="+res);
	}

	public static int fact(int x){
		if(x==1 || x==0){
			return 1;
		}
		return x*fact(x-1);
	}
}