package Patterns;

import java.util.Scanner;

public class invrtNumPrmd {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int h;
         System.out.println("Enter height: ");
         h=sc.nextInt();

         for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
         }
        

    }
}
