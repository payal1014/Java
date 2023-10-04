package Programm;

public class ReverseStringLeftToRight {
    public static void main(String[] args){
        String city = "Nagpur";
        String city1 = " ";
        for (int i = 0; i<city.length();i++){

        }
        for (int i=city.length()-1;i>=0;i--){
            city1 = city1+city.charAt(i);
            System.out.println(city1);
        }
        String name = "Monika";
        String  name1 = " ";
        for(int i = 0;i<name.length();i++){

        }
        for(int i=name.length()-1;i>=0;i--){
            name1 = name1+name.charAt(i);
            System.out.println(name1);
        }
        String ab = "Nagpur";
        String ab1 = " ";
        for (int i = 0;i<ab.length();i++){
            System.out.print(ab.charAt(i));
        }
        for (int i =ab.length()-1;i>=0;i--){
            ab1 = ab1+ab.charAt(i);
            System.out.println(ab1);
        }

        String a = "Amravati";
        String b = " ";
        for(int i = 0;i < a.length();i++){

        }
        for(int i = a.length()-1;i>=0;i--){
            b = b+a.charAt(i);
            System.out.println(b);
        }


    }

}
