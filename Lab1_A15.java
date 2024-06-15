import java.util.Scanner;

public class Lab1_A15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int x=sc.nextInt();

		double sum=0;

		for(int i=1;i<=x;i++){
			sum+=i;
		}
		double avg = sum/x;
		System.out.println("AVG="+avg);
	}
}