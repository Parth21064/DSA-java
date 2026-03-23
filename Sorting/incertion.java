package Sorting;

public class incertion {
    public void sort(int []arr){

        int idx,key;

        for(int i=1;i<arr.length;i++){
            key=arr[i];
            idx=i-1;
            while (idx>=0 && arr[idx]>key) {
                arr[idx+1]=arr[idx];
                idx--;
            }

            arr[idx+1]=key;
        }
    }
}
