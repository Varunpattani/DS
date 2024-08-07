public class Lab19_93 {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3};
        int temp = 0;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
