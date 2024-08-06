public class Lab18_91 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 4;
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == key){
                System.out.println("Element is present at index " + mid);
                break;
            }
            else if(key > arr[mid]){
                left = mid + 1;
            }
            else right = mid - 1;
        }  
    }
    
}
