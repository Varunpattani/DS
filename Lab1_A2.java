import java.util.Scanner;

public class Lab1_A2{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    
    if(a%2==0)        System.out.println("Even");
    
    else if(a==0)     System.out.println("Zero");
    
    else              System.out.println("Odd");
}
}