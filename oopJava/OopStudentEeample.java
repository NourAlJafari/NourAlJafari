
package edu.zuj.oop.example;

public class Student {
private int ID;
private String name;
private String mojer;
private int mark1 ;
private int mark2;
private int mark3;
private int mark4;
private double avg;

public Student(){
    
}

    public Student(int ID, String name, String mojer, double avg) {
        this.ID = ID;
        this.name = name;
        this.mojer = mojer;
        this.avg = avg;
        
}
      public Student(int mark1, int mark2, int mark3, int mark4, double avg) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.avg = avg;
    }

    public void setMark1(int mark1) {
        if (mark1>=50&&mark1<100){
            this.mark1=mark1;
        }
        else {
            System.out.println("undefine!");
              System.exit(0);
        }
    }
    

    public void setMark2(int mark2) {
        if (mark2 >= 50 && mark2<100){
           this.mark2=mark2;
        }
        else {
            System.out.println("undefine!");
            System.exit(0);
        }
    }

    public void setMark3(int mark3) {
        if (mark3 >= 50 && mark3<100){
           this.mark3=mark3;
        }
        else {
            System.out.println("undefine!");
            System.exit(0);
        }
    }

    public void setMark4(int mark4) {
        if (mark4 >= 50 && mark4<100){
           this.mark4=mark4;
        }
        else {
            System.out.println("undefine!");
            System.exit(0);
        }
    }

    public int getID() {
          return ID;
    }
     public void setID(int ID) {
         if (ID ==202513452){
        System.out.println("Your name is Nour ");
        System.out.println("Your mejer is software enginering ");
        }
        else {
            System.out.println("undefine");
            System.exit(0);
        }
       
    }
 
     public void setName(String name) {
        this.name = name;
    }
    public String getMojer() {
        return mojer;
    }
    public void setMojer(String mojer) {
        this.mojer = mojer;
    }
    public double getAvg()
    {  
         avg=(mark1+mark2+mark3+mark4)/4.0;
        if(avg>=90.0){
            System.out.println("Exelent");
        }
     else   if  (avg>=80.0 &&avg <=70.0){
            System.out.println("very good");
        }
     else if (avg<69.0){
            System.out.println("good");
     }
      
        return avg ;
    }
          
    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + ", mojer=" + mojer + ", avg=" + avg + '}';
    }   
}


package edu.zuj.oop.example;
import java.util.Scanner;
public class studentTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student s1=new Student();
        System.out.print("Enter your ID :");
        s1.setID(in.nextInt());
        System.out.print("Enter your mark1:");
        s1.setMark1(in.nextInt());
                System.out.print("Enter your mark2 :");
        s1.setMark2(in.nextInt());
                System.out.print("Enter your mark3:");
        s1.setMark3(in.nextInt());
                System.out.print("Enter your mark4:");
        s1.setMark4(in.nextInt());
                System.out.println("Average= "+s1.getAvg());
        
    }
}
