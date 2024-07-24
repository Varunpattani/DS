import java.util.Scanner;
public class Lab4_A21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a=sc.nextInt();

		System.out.println("Enter index:");
		int x=sc.nextInt();

		int[] b ={1,2,3,5};

		int[] y = new int[(b.length+1)]; 

		for(int i=0;i<(b.length+1);i++){
			if(i<x){
				y[i]=b[i];
			}
			else if(i==x){
				y[i]=a;
			}
			else{
				y[i]=b[i-1];
			}
		}
		System.out.println("New Array:");
		for (int j=0;j<y.length;j++) {
			System.out.println(y[j]);
		}

	}
}