package Sorting;
public class quick {

    public int partition(int []arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if (arr[j]<pivot) {
                i++;
                //swap

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
            i++;

            // swap

            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
        

        return i;
    }

    public void sorting(int []arr,int low,int high){
        if (low<high) {
            
        int pidx=partition(arr,low,high);

        sorting(arr, low, pidx-1);
        sorting(arr, pidx+1, high);
    }

    }

    public void sort(int []arr){
        int low=0;
        int high=arr.length-1;

        sorting(arr, low, high);
    }
}
