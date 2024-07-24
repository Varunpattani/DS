public class Lab4_26{
	public static void main(String[] args) {
		int[] a = {3,4,1};
		int[] b = {5,9,2};
		int y = 0;
		int n = a.length + b.length;
		int [] c = new int[n];

		for(int i=0;i<a.length;i++){
			c[y] = a[i];
			y++;
		}
		for(int i=0;i<b.length;i++){
			c[y] = b[i];
			y++;
		}
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
}