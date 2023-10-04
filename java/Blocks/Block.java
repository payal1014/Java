package Blocks;

public class Block {
    static int no;
    static String name;
    static {
        no = 15;
        System.out.println("value of static block is 15");
        name = "Payal";
        System.out.println("Name of static block is payal");
    }
    {
        System.out.println("value of non static block is 30");
        System.out.println("Name of non static block is Javanjal");
    }
    public static void main(String[] args){
        System.out.println(no);
        System.out.println(name);
    }
}
