import java.util.Scanner;

public class Lab1_9{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Seconds:");
		int sec = sc.nextInt();

		int min=0,hr=0;

		while(sec!=0){
			if(sec>3600){
				hr++;
				sec-=3600;
			}

			if(sec<3600 || sec>=60){
				min++;
				sec-=60;
			}
			if(sec<60){
				break;
			}
		}
		
		
		System.out.println("Hour="+hr+" Min="+min+" Seconds="+sec);

	}
}