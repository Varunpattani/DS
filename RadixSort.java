public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {121,432,564,23,1,45,788};
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) max = arr[i]; 
        }
        for(int place = 1;max/place>0;place*=10){
            arr = rSort(arr,n,place);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static int[] rSort(int[] arr,int n,int place){
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i]/place)%10]++;            
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] B = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            B[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        } 
        return B;
    } 
}

