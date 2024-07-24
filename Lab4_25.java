import java.util.Scanner;

public class Lab4_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = {1, 2, 4, 4, 5, 6};

		int count = 0;
		int[] b = new int[a.length]; 
		int num = 0;


		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
                    
					if (!isDuplicate(b, num, i)) { 
						b[num] = i;
						num++;
					}
					count++;
				}
			}
		}


		int[] ans = new int[a.length - count];
		int m = 0;
		for (int i = 0; i < a.length; i++) {
            if (!isDuplicate(b, num, i)) { 
            	ans[m] = a[i];
            	m++;
            }
        }


        System.out.println("New Array:");
        for (int i = 0; i < ans.length; i++) {
        	System.out.println(ans[i]);
        }
    }

    
    private static boolean isDuplicate(int[] b, int num, int idx) {
    	for (int k = 0; k < num; k++) {
    		if (b[k] == idx) {
    			return true;
    		}
    	}
    	return false;
    }
}
