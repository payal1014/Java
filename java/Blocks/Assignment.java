package Blocks;

public class Assignment {
    int no;
    public static String name;

    static{
       name = "Payal";
        System.out.println("she name is " + name);
    }
    {
        no = 14;
        name = "Hansika";
        System.out.println("She birth date is " + no);
        System.out.println("She name is " + name);
    }

    public static void main(String[] args){
        System.out.println("Value of global veriable in the main method: " + name);
    }
}
