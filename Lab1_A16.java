import java.util.Scanner;

public class Lab1_A16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int m=sc.nextInt();

		int[] x = new int[m];

		for(int i=0;i<m;i++){
			System.out.println("Enter element "+(i+1)+":");
			x[i]=sc.nextInt();
		}
		int min=x[0],max=x[0];

		for(int i=0;i<m;i++){
			if(min>x[i]){
				min=x[i];
			}
			if(max<x[i]){
				max=x[i];
			}
		}
		System.out.println("Min="+min);
		System.out.println("Max="+max);
	}
}