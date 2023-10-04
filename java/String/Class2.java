package String;

public class Class2 {
    public static void main(String[] args){
        String city = "Amravati";
        String city1 = "Nagpur";
        String city2 = "Nagpur";
        city1.length();
        System.out.println(city1.length());
        System.out.println(city.equals(city1));
        System.out.println(city.equalsIgnoreCase(city1));
        System.out.println(city1.equals(city2));
        System.out.println(city.charAt(0));
        System.out.println(city1.charAt(4));
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.isEmpty());
        System.out.println(city1.replace('N','A'));
        System.out.println(city2.replaceAll("Nagpur","Akola"));
        System.out.println(city.substring(0,4));



    }
}
