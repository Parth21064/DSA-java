package Array;

import Array.prntArr;

public class revArray {

    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

   static void rev(int[]arr){
    int size=arr.length;
    for(int i=0;i<size/2;i++){
        swap(arr, i, size-i-1);
    }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        prntArr obj=new prntArr();

        System.out.println("Og array:");
        obj.PrintArr(arr);

        System.out.println("Reverse array: ");
        rev(arr);
        obj.PrintArr(arr);

    }
}
