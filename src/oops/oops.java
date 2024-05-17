package oops;

public class oops {
    public static void main(String args[]) {
        Animal ani=new Animal();
        ani.setColor("blue");
        System.out.println(ani.color);
        // FISH
        fish sh1=new fish();
        sh1.swim();
        sh1.breath();
        sh1.eat();
        sh1.setColor("yellow");
        System.out.println(sh1.color);

        //BIRD
        bird bhi=new bird();
        bhi.fly();
        bhi.eat();

        // MAMMAL
        mammal mi=new mammal();
        mi.eat();
        mi.breath();
        // oops.shark
        shark si=new shark();
        si.eat();
        si.breath();
        // oops.tunna
        tunna t1=new tunna();
        t1.swim();
        // oops.dog
        dog d1=new dog();
        d1.eat();
    }
    }


       // Pen p1=new Pen();
      //  p1.setColor("blue");
       // System.out.println(p1.color);
       // p1.setTip(5);
      //  System.out.println(p1.tip);
      //  p1.setColor("green");
      //  System.out.println(p1.color);
    //}
  //}
//class Pen{
    // properties & functions
   // String color;
   // int tip;
    // void setColor(String newColor){
       //  color=newColor;
    // }
     //void setTip(int newTip){
       //  tip=newTip;
    // }
//}


      // BASE CLASS
   class Animal{
    String color;
    void setColor(String newColor){
        color=newColor;
    }
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
       }

       // DERIVED CLASS/SUB CLASS
    class mammal extends Animal{

     void eat(){
        System.out.println("eats something");
    }
    void breath(){
        System.out.println("breaths");
    }
       }

       class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
    void breath(){
        System.out.println("breath");
    }
       }

       class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
    void eat(){
        System.out.println("eat");
    }
       }

       class dog extends mammal{
    void walk(){
        System.out.println("walk");
    }
    void breath(){
        System.out.println("breath");
    }
       }

       class cat extends mammal{
    void walk(){
        System.out.println("walk");
    }
    void breath(){
        System.out.println("breath");
    }
       }

       class shark extends fish{
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
       }

       class tunna extends fish{
    void eat(){
        System.out.println("eat");
    }
       }

       class peacock extends bird{
    void fly(){
        System.out.println("bird");
    }
    void eat(){
        System.out.println("eat");
    }
       }

