package edu.zuj.oop;

public class film {
String name ;    
int year;
String type;
String auther;
public void playMoves(){
    System.out.println("playing moves: "+name+ year+" is already playing ");
    
}
public void puseMoves(){
     System.out.println("passing moves:"+name+" is already stop");
}
public void movesInfor(){
            System.out.println("Moves "+name +"genre "+type+" in "+year);
}

}
public class test2 {
    public static void main(String[] args) {
        film in=new film();
        in.name="harry potter ";
        in.type="action";
        in.year=2014;
        in.auther="J.K Rowling";
        in.movesInfor();
        in.playMoves();
        in.puseMoves();
                
    }
    
