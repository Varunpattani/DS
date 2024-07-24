public class Lab3_19{
	
	public static void main(String[] args) {
		int count=0;
		int num=1;
		for(int i=0;i<5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			num=1;
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				num = num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}