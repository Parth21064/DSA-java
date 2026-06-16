package Searching;

import java.util.Scanner;

public class linear {

    public static int search(int []arr,int target){


        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []arr={2,43,22,76,12,-5,0,13};
        System.out.println("Enter target: ");
        int target=sc.nextInt();

        int idx=search(arr, target);

        if (idx!=-1) 
            System.out.println("Target found at index: "+(idx+1));
        else
            System.out.println("Target not found..");
    }
}
