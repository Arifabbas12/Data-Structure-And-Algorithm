package oops;

   public class inhretence{
     public static void main (String args[]){
        Child c1=new Child();
        c1.walk();
        c1.eat();
        baby b1=new baby();
        b1.eat();
        b1.walk();
        b1.breath();
        b1.sleep();
        b1.weep();
    }
}
    class Human{
    void eat(){
        System.out.println("eats every things");
    }
    void breath(){
        System.out.println("braeth");
    }
}
 class Child extends Human{
    void walk(){
        System.out.println("walk");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void weep(){
        System.out.println("weep");
    }
}
  class baby extends Child{
     void eat(){
        System.out.println("something eat");
    }
    void walk(){
        System.out.println("something walk");
    }
}
