import java.util.Scanner;

public class Lab1_A8{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    
    int count=0;
    for(int i=2;i<=9;i++){
        if(a==i)  {count++;break;}
        else{
        if(a%i==0) { System.out.println("Not Prime");break;
        }
        else{count++;}}
    }
    if(count>0) System.out.println("Prime");
   
}
}