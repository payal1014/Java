package OOPS.Inheritance.HierarchicalInheritance;

public class Son2 extends Father {
    public void home(){
        System.out.println("Son2 have one home");
        land();
    }
    public static void main(String[] args){
        Father pro = new Father();
        pro.car();

        Son1 prop = new Son1();
        prop.Iphone();
        prop.bike();
        prop.father();

        Son2 properties = new Son2();
        properties.home();
    }

}
