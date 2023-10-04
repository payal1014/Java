package OOPS.Inheritance.MiltiLevelInheritance;

public class Flat extends Home {
    public void flatFloor(){
        System.out.println("This is 2nd floor");
    }
    public void flat(){
        System.out.println("This flat is 2bhk");
    }
    public void flatColour(){
        System.out.println("This flat colour is cream");
    }
    public void homeKno(){
        carknow();
        home();
        homeColour();
        homePrice();
    }
    public static void main(String[] args){
        Flat proper = new Flat();
        proper.flatFloor();
        proper.flat();
        proper.flatFloor();
        proper.homeKno();
    }
}
