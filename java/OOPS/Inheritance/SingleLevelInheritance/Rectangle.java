package OOPS.Inheritance.SingleLevelInheritance;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;


    }
    public static void main(String[] args){
        Rectangle rect = new Rectangle(3.0,10.0);
        double area = rect.getArea();
        System.out.println("The area of rectangle is: " + area);

    }
}
