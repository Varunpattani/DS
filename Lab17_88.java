import java.util.Scanner;

public class Lab17_88 {
    static int[] hash = new int[20];

    public static void main(String[] args) {
        int[] arr = new int[15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * 999999);
        }
        for (int i = 0; i < 15; i++) {
            int index = hashFunc(arr[i]);
            pro(index, arr[i]);
        }
        for (int a : hash) {
            System.out.println(a);
        }
        sc.close();
    }

    public static int hashFunc(int val) {
        return (val % 18) + 2;
    }

    public static void pro(int index, int num) {
        while (hash[index] != 0) {
            index = ++index % 20;
        }
        hash[index] = num;
    }
}