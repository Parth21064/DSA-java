package Array;

import java.util.Scanner;

public class prefSum {

    static int [] pSum(int[]arr){
        int size=arr.length;

        int []pArr=new int[size];
        pArr[0]=arr[0];
        for(int i=1;i<size;i++){
            pArr[i]=pArr[i-1]+arr[i];
        }

        return pArr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        prntArr obj=new prntArr();


        System.out.println("Enter size of array: ");
        int size=sc.nextInt();

        System.out.println("Enter your array: ");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Og array:");

        obj.PrintArr(arr);

        System.out.println("\nPrefix sum array: ");


        obj.PrintArr(pSum(arr));



    }
}
