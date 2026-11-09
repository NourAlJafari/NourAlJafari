
package edu.zuj.oop;

public class person {
    
   String  name ;
   int age;
   public void talk (){
       System.out.println("my name is "+name +" my age is "+age);
   }
    
}
package edu.zuj.oop;

public class NewClass {
    public static void main(String[] args) {
        person n=new person();
         n.name="Nour";
         n.age=19;
         n.talk();
    }
    
}
