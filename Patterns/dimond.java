package Patterns;

import java.util.Scanner;

public class dimond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int h;
         System.out.println("Enter height: ");
         h=sc.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=h;i++){

            for(int p=1;p<=i-1;p++){
                System.out.print("   ");
            }
            for(int j=1;j<=2*(h-i)+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        

    }
}
