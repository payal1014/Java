package OOPS.Abstraction;

public class CarName implements Car {
    @Override
    public void Car1() {
        System.out.println("the name of car1 is Swift");
    }

    @Override
    public void Car2() {
        System.out.println("The name of car2 is Honda city");
    }

    public static void main(String[] args){
        CarName name = new CarName();
        name.Car1();
        name.Car2();
    }
}
