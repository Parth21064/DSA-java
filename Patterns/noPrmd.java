package Patterns;

import java.util.Scanner;

public class noPrmd {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        System.out.println("Enter your num: ");
        int h;
        h=sc.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
