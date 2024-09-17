public class Lab22_99 {
    public static void main(String[] args) {
        int[] arr = {80,93,60,12,42,30,68,85,10};
        int n = arr.length;
        shellSort(arr, n);
        for(int a : arr) System.out.print(a + " ");
        
    }
    public static void shellSort(int[] arr,int n){
        for(int gap = n/2; gap>=1; gap/=2){
            for(int y = gap; y<n; y++){
                for(int i = y - gap; i>=0;i-=gap){
                    if(arr[i+gap]>arr[i]) break;
                    else{
                        int temp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = temp;
                    }
                }
            }
        }
    }
}
