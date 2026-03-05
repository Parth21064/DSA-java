package Patterns;

import java.util.Scanner;

public class invrtHalfPrmd {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int h;
         System.out.println("Enter height: ");
         h=sc.nextInt();

         for(int i=1;i<=h;i++){
            for(int j=h;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
         }
        

    }
}
