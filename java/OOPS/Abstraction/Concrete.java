package OOPS.Abstraction;

public class Concrete extends AbstractClass{
    public void car(){
        System.out.println("This car Name is Swift");
    }
    public static void main(String[] args){
        Concrete name = new Concrete();
        name.car();
        name.car2();
    }
}
