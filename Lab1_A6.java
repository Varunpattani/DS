import java.util.Scanner;

public class Lab1_A6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    
    System.out.println("Enter power:");
    int b=sc.nextInt();
    
    int v=1;
    
    for(int i=1;i<=b;i++){
        v*=a;
    }
    System.out.println("Ans="+v);
}
}