
package edu.zuj.oop;

import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
  Scanner in=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i%2!=0){
                System.out.print(i +",");
            }
              
          
        }
    }
    
}
