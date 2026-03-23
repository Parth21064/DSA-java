package Array;

import java.util.Scanner;

public class prntArr {

    public void PrintArr(int []arr){
        System.out.println("The Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of your array: ");

        int size=sc.nextInt();

        System.out.println("Enter your array: ");
        int []arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       prntArr obj=new prntArr();

       obj.PrintArr(arr);




    }
}
