package Patterns;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your num: ");
        int h;
        h=sc.nextInt();



        {
            for(int j=1;j<=h;j++){
                for(int k=1;k<=h;k++){
                    if(k<=j)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
                for(int k=1;k<=h;k++){
                    if(k<=h-j)
                        System.out.print("   ");
                    else
                        System.out.print(" * ");
                }
                System.out.println();
        
            }
            for(int i=1;i<=h;i++){
                for(int j=1;j<=h;j++){
                    if(j<=h-i+1)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
                for(int j=1;j<=h;j++){
                    if(j<i)
                        System.out.print("   ");
                    else
                        System.out.print(" * ");
                }
                System.out.println();
            }
           

        }
    }
}
