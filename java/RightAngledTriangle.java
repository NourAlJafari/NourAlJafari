
package edu.zuj.oop;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        for (int row = 1; row <= n; row++) {
            System.out.println(" ");
            for (int colum = 1; colum <= row; colum++) {
                System.out.print("*");
            }
        }
    }
    
}
