package OOPS.Inheritance.MiltiLevelInheritance;

public class Home extends Car1{
    public void home(){
        System.out.println("It is 1bhk home");
    }
    public void homeColour(){
        System.out.println("Home colour is White");
    }
    public void homePrice(){
        System.out.println("This home price is 2500000");
    }
    public void carknow(){
        carName();
        carColour();
        carPrice();
    }
}
