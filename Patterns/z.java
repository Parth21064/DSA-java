package Patterns;

import java.util.Scanner;

public class z {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int h;
         System.out.println("Enter height: ");
         h=sc.nextInt();

         for(int i=1;i<=h;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print(" 1 ");
                }
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
         }

         
        

    }
}
