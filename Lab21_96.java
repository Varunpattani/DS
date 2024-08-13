public class Lab21_96 {

    public static void main(String[] args) {
        int[] a = {2,5,4,1,3};
        mergeSort(a,0, a.length -1);        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void mergeSort(int[] a,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }

    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = 0;
        int j = mid+1;
        int h = low;
        while(h<=mid && j<=high){
            if(a[h]<a[j]){
                temp[i]=a[h];
                h++;
            }
            else{
                temp[i]=a[j];
                j++;
            }
            i++;
        }
        if(h>mid){
            while(j<=high){
                temp[i]=a[j];
                j++;
                i++;
            }
        }
        else{
            while(h<=mid){
                temp[i]=a[h];
                h++;
                i++;   
            }
            
        }
        
        for(int k=0;k<temp.length;k++){
            a[k+low]=temp[k];
        }
    }
}
