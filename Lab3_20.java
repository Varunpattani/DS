import java.util.Scanner;

public class Lab3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range:");
        int n = sc.nextInt();
        

        String[] str = new String[n];

        System.out.println("Enter Names:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next(); 

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }

       
        System.out.println("Sorted Names:");
        for (String name : str) {
            System.out.println(name);
        }

    }
}
