import java.util.Scanner;
public class Lab1_10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter days:");
		int days = sc.nextInt();

		int year=0,week=0;
		
		while(days!=0){
			if(days>365){
				year++;
				days-=365;
			}
			if(days>=7){
				week++;
				days-=7;
			}
			if(days<7){
				break;
			}
		}
		System.out.println("Year="+year+" Week="+week+" Days="+days);

	}
}