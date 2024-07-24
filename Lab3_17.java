public class Lab1_17{
public static void main(String[] args) {
	int[] a = {1,2,5,3,5,2,4,3};
	System.out.println("Duplicate Numbers:");
	for(int i=0;i<a.length;i++){
		for (int j=i+1;j<a.length ;j++ ) {
			if(a[j]==a[i]){
				System.out.println(a[j]);
			}
		}
	}
}
}