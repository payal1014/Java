package OOPS.Inheritance.SingleLevelInheritance;

public class Son1 extends Father1{
    public void car(){
        System.out.println("Son have black colour car");
    }
    public void flat(){
        System.out.println("Son have 1bhk flat");
    }
    public void fatherProperty(){
        bike();
        flat();
    }
    public static void main(String[] args){
        Son1 pro = new Son1();
        pro.car();
        pro.flat();
        pro.fatherProperty();

    }
}
