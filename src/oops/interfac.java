package oops;

public class interfac {   // using interface
    public static void main(String args[]){
        allrounder ar1=new allrounder();
        ar1.play();
        ar1.run();
        ar1.quarrel();
        ar1.cool();
        batsman b1=new batsman();
        b1.play();
        b1.run();
        b1.quarrel();
        b1.cool();
        bowler b2=new bowler();
        b2.play();
        b2.run();
        b2.quarrel();
        b2.cool();
    }
}
interface cricketer{
    void play();
    void run();
    void quarrel();
    void cool();
}
class batsman implements cricketer{
    public void play(){
        System.out.println("only the batsman");
    }
    public void run(){
        System.out.println("only run on th crease");
    }
    public void quarrel(){
        System.out.println("only bowler");
    }
    public void cool(){
        System.out.println("not cool");
    }
}
class allrounder implements cricketer{
    public void play(){
        System.out.println("bowler both");
    }
    public void run(){
        System.out.println("run on crease and bowling side");
    }
    public void quarrel(){
        System.out.println("batsman and bowler both");
    }
    public void cool(){
        System.out.println("cool");
    }
}
class bowler implements cricketer{
    public void play(){
        System.out.println("only bowler");
    }
    public void run(){
        System.out.println("only run bowling side");
    }
    public void quarrel(){
        System.out.println("only batsman");
    }
    public void cool(){
        System.out.println("not cool");
    }
}
