package Searching;

import java.util.*;

public class binary {
    public static int search(int []arr,int target,int low,int high){
        int mid=low+(high-low)/2;
        if (low<=high){

        if (target==arr[mid]) {
            return mid;
        }
            
        else if (target>arr[mid]) 
            return search(arr, target, mid+1, high); 
        
        else
            return search(arr, target, low, mid-1);
    }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []arr={-5,0,2,12,13,22,43,76};
        System.out.println("Enter target: ");
        int target=sc.nextInt();

        int low,high;

        low=0;
        high=arr.length-1;

        int nidx=Arrays.binarySearch(arr, high);

        int idx=search(arr, target,low,high);

        if (idx!=-1) 
            System.out.println("Target found at index: "+(idx+1));
        else
            System.out.println("Target not found..");
    }


}
