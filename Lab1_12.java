
public class Lab1_12{
	public static void main(String[] args) {
		
		int rem=0,sum=0,n=0;

		for(int i=1;i<=1000;i++){
			n=i;
			while(n!=0){
				rem=n%10;
				sum = sum + (rem*rem*rem);
				n/=10;

			}
			if(i==sum) System.out.println(sum);
			sum=0;
		}
		

	}
}