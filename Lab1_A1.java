import java.util.Scanner;

public class Lab1_A1{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius:");
    Double a=sc.nextDouble();
    Double area=Math.PI*a*a;
    System.out.println("Area:"+area);
    
}
}