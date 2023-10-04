package OOPS.Inheritance.SingleLevelInheritance;

public class Son extends Father{
    String bike = "son have two bike";
    public void home(){
        System.out.println("Son have one home");
    }
    public void mobile(){
        System.out.println("Son have two mobiles");
    }
    public void flat(){
        System.out.println("Son have one flat");
    }
    public void fatherProparties(){
        land();
        home();
        car();
        flat();
    }
    public static void main(String[] args){
        Son property = new Son();
        property.fatherProparties();
        property.flat();
        property.mobile();
        System.out.println(property.bike);

        Father properties = new Father();
        properties.car();
        properties.flat();
        properties.shirt();
        properties.home();
        properties.land();
        System.out.println(properties.bike);
    }

}
