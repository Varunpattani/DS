import java.util.Scanner;
public class Lab4_A23{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int x=sc.nextInt();

		int[] b ={1,2,3,5};

		int[] y = new int[(b.length+1)]; 

		int count=0;
			
			while(x>b[count] && count<b.length){
				y[count]=b[count];
				count++;
			}
			y[count]=x;
			

			for(int i=count;i<b.length;i++){
				y[i+1]=b[i];
			}

			
		System.out.println("New Array:");
		for(int j=0;j<(b.length+1);j++){
			System.out.println(y[j]);
		}
		

	}
}