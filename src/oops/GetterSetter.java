package oops;

public class GetterSetter {
    public static void main(String args[]){
        pen p1=new pen();
        System.out.print("The color is : ");
        p1.setColor("red");
        System.out.println(p1.getColor());
        System.out.print("The tip is : ");
        p1.setTip(5);
        System.out.println(p1.getTip());
        System.out.print("The marks is: ");
        p1.setMarks(68.65f);
        System.out.println(p1.getMarks());
        System.out.print("The percentage is : ");
        p1.setPercentage(87.77f);
        System.out.println(p1.getPercentage());
    }
}
class pen{
    String color;
    int tip;
    float marks;
    float percentage;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    float getMarks(){
        return this.marks;
    }
    float getPercentage(){
        return this.percentage;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
    void setMarks(float newMarks){
        this.marks=newMarks;
    }
    void setPercentage(float percentage){
        this.percentage=percentage;
    }
}
