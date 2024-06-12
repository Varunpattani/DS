import java.util.Scanner;

public class Lab1_A7{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    
    System.out.println("Factors=");
    for(int i=1;i<=a;i++){
        if(a%i==0)  System.out.println(i);
    }
   
}
}