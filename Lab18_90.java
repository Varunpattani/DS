public class Lab18_90{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3;
        for(int i=0; i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("INDEX = "+i);
                break;
            }
        }
    }
}