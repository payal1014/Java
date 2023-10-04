package MethodAndVariables;

public class Class1 {

    public static int no= 1;
    public int no1 = 2;
    public static void main(String[]args){
        method1();
        System.out.println(no);
        Class1 obj = new Class1();
        obj.method2();
        System.out.println(obj.no1);

    }

    public static void method1() {
        String name = "Payal";
        System.out.println(name);
    }
    public void method2() {
        String city = "Akola";
        System.out.println(city);
    }

}
