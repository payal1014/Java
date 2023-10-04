package String;

public class Class1 {
    public static void main(String[] args){
        //String without using new keyword
        String name = "Payal";
        String name1 = "Payal";
        boolean result = name.equals(name1);
        System.out.println("If the content of two string is " + result);
        boolean result1 = name == name1;
        System.out.println("If the memory of two string is " + result1 );

        //String with using new key word

        String name2 = new String("Hansika");
        String name3 =  new String("Hansika");
        System.out.println(name2==name3);
        System.out.println(name1==name3);






    }
}
