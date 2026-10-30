
package edu.zuj.oop.week3.array;
import java.util.Scanner;
public class ExampleJava {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter Length of Array:");
        int n=s.nextInt();
        int arr [ ]=new int [n]; 
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter the Number "+(i+1)+":");
            arr[i]=s.nextInt();    
        }
        System.out.println("====================");
        System.out.println("Choose one ! ");
        System.out.println("1. print max number");
        System.out.println("2. print min number ");
        System.out.println("3.print sum of number");
        System.out.println("4.print average ");
        System.out.println("=======================");
        System.out.print("Enter your Choice:");
        int c=s.nextInt();
        switch(c){
            case 1:      
        int max=arr[0];
        for (int i = 1; i <arr.length; i++) {
             max=Math.max(arr[0], arr[i]); 
              }
      System.out.println("max of all number : "+max);break;
            case 2:   int minm=arr[0];
        for (int i = 1; i <arr.length; i++) {
           minm=Math.min(arr[0], arr[i]); }
             System.out.println("min of all number is : "+minm);break;
             case 3:
                 int sum=0;
             for (int j = 0; j < arr.length; j++) {
    sum+=arr[j]; 
      }  
             System.out.println("sum os all number : "+sum);break;
             case 4:
                 int summ=0;
             for (int j = 0; j < arr.length; j++) {
    summ+=arr[j]; }
                 double avr = summ/arr.length;
                 System.out.println("average of all number : "+avr);break;
             default :
                 System.out.println("undefind !");
    }
}
    }