package Casting.NonPrimitiveCasting;

public class Son extends Father{
    public int age = 20;

    public void car(){
        System.out.println("Son have a black car");
    }
    public void plot(){
        System.out.println("Son have 1 plot");
    }

    public void Iphone(){
        System.out.println("Son have 2 Iphone");
    }

    public static void main(String[] args){
        Father ob = new Son();
        ob.car();
        ob.plot();
        ob.mobile();
        System.out.println(ob.bike);

        Son ob1 = (Son) ob;
        ob1.car();
        ob1.plot();
        ob1.Iphone();
        System.out.println(ob1.age);
    }
}
