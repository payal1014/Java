package OOPS.Inheritance.SingleLevelInheritance;

public class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing a car");
    }
    public static void main(String[] args){
        Car rep = new Car();
        rep.drive();
        Vehicle repai = new Vehicle();
        repai.drive();


    }
}
