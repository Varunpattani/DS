import java.util.Scanner;
public class Lab4_24{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int x=sc.nextInt();
		
		int[] a = {1,2,4,5,6};

		int[] b = new int[a.length-1];

		for(int i=0;i<a.length-1;i++){
			if(x==a[i] || x<a[i]){
				b[i]=a[i+1];
			}
			else b[i]=a[i];
		}
		System.out.println("New Array:");
		for(int i=0;i<a.length-1;i++){
			System.out.println(b[i]);
		}
	}
}