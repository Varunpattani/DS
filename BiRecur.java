public class BiRecur {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 1;
        int ans = biSearch(0,arr.length,arr,key);
        System.out.println(ans);
    }
    public static int biSearch(int left,int right,int[] arr,int key){
        if(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) return biSearch(mid+1,right,arr,key);
            else return biSearch(left,mid-1,arr,key);
        }
        else return -1;

    }
}
