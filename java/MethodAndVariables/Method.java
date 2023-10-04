package MethodAndVariables;

public class Method {
    public static void subtraction(){
        int no = 10;
        int no1 = 9;
        System.out.println(no-no1);
    }
    public void City (){
        String city1 = "Akola";
        String city2 = "Nagpur";
        System.out.println(city1);
        System.out.println(city2);

    }
    public static void main(String[] args){
        subtraction();
        Method cityName = new Method();
        cityName.City();

    }

}
