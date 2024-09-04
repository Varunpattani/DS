

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,1,3,4,1,4,2};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) max = arr[i]; 
        }
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] B = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            B[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
                                                                                                                                                      
    }
    
}
