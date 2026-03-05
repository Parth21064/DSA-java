package Patterns;

import java.util.Scanner;

public class hollowSqr {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

        int h,b;
         System.out.println("Enter height: ");
         h=sc.nextInt();
         System.out.println("Enter bredth: ");
         b=sc.nextInt();


         for(int i=0;i<h;i++){
            for(int j=0;j<b;j++){
                if (i==0||j==0||i==h-1||j==b-1) {
                    System.out.print(" * ");
                }
                else
                System.out.print("   ");
            }
            System.out.println();

         }

}
}
