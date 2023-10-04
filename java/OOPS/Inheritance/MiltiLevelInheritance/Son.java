package OOPS.Inheritance.MiltiLevelInheritance;

public class Son extends Father{
    public void Iphone(){
        System.out.println("Son have one Iphone");
    }
    public void flat(){
        System.out.println("Son have two flats");
    }
    public void sportsBike(){
        System.out.println("son have one sportbike");
    }


    public static void main(String[] args){
        Son proper = new Son();
        proper.grandFatherProp();
        proper.car();
        proper.plot();
        proper.bike();
        proper.flat();
        proper.Iphone();
        proper.sportsBike();
    }
}
