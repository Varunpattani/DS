import java.util.Scanner;

public class Lab3_A13{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int x=sc.nextInt();
    int[] a = new int[x];
    
    for(int i=0;i<x;i++){
        a[i]=sc.nextInt();
    }

    for(int i=0;i<x;i++){
        System.out.println(a[i]);
    }
    
   
}
}