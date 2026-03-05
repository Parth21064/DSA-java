package Patterns;

import java.util.Scanner;

public class palindromicNumPrmd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your number of steps: ");
        int h;
        h=sc.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
