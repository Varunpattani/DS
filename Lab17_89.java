import java.util.Hashtable;
import java.util.Scanner;

public class Lab17_89 {
    public static void main(String[] args) {
        Hashtable<String, Integer> dic = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 3) {
            System.out.println("Enter 1 for enter:");
            System.out.println("Enter 2 for search:");
            System.out.println("Enter 3 for end:");
            n = sc.nextInt();
            String key = "";
            switch (n) {
                case 1:
                    System.out.println("Enter key:");
                    key = sc.next();
                    System.out.println("Enter value:");
                    int value = sc.nextInt();
                    dic.put(key, value);
                    break;
                case 2:
                    System.out.println("Enter key:");
                    key = sc.next();
                    System.out.println("Key = " + dic.get(key));
                    break;
            }
        }
        sc.close();
    }
}
