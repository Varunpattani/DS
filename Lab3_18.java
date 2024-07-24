import java.util.Scanner;
public class Lab3_18{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();

		int index=0;
		for(int i=0;i<n;i++){
			if(arr[i]==num1){
				arr[i]=num2;
				System.out.println("Index="+i);
				break;
			}
		}
		
		System.out.println("New array:");
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}
}