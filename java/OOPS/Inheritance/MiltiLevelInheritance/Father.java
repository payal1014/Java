package OOPS.Inheritance.MiltiLevelInheritance;

public class Father extends GrandFather {
    public void plot(){
        System.out.println("Father have 5 plots");
    }
    public void bike(){
        System.out.println("Father have 1 bike");
    }
    public void car(){
        System.out.println("Father have 1 car");
    }
    public void grandFatherProp(){
        home();
        farm();
        System.out.println(mobile);
    }
}
