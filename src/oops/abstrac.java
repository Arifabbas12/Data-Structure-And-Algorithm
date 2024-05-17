package oops;

public class abstrac { // abstract class create
    public static void main (String args[]){
       Hollywood r1=new Hollywood();
        r1.Thriller();
        r1.Action();
       Bollywood m1=new Bollywood();
        m1.Thriller();
        m1.Action();
        SouthIndians c1=new SouthIndians();
            c1.Thriller();
            c1.Action();
    }
}
  abstract class MoviesCollection{
    void Action(){        // unAbstract method
        System.out.println(" Every Film industries has own killer performance ");
    }

    abstract void Thriller ();     // abstract method
}
class Hollywood extends MoviesCollection{
  void Thriller(){
        System.out.println("Hollywood includes Drama and thrill performance");
    }
}
class Bollywood extends MoviesCollection{


    void Thriller(){
        System.out.println(" Bollywood includes comedy and thriller");
    }

}
class SouthIndians extends MoviesCollection{
    void Thriller(){
        System.out.println("South indian has own Holistic and culture emotional experience.  ");
    }
}

