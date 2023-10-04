package Blocks;

public class StaticAndNonStaticVeriables {
    String name = "Payal";
    static  String name1 = "Hansika";
    public static void nameOfStudent(){
       // System.out.println(name); error is displayed
        System.out.println(name1);
    }
    public void nameOfStudent1(){
       System.out.println(name);
       System.out.println(name1);
     }
    public static void main(String[] args){
        System.out.println(name1);
        StaticAndNonStaticVeriables obj = new StaticAndNonStaticVeriables();
        System.out.println(obj.name);
    }
}
