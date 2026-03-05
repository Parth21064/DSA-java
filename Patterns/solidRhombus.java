package Patterns;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your number: ");

        int h;
        h=sc.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=h;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
