package OOPS.Encapsulation;

public class AccessCity {
    public static void main(String[] args){
        CityName name = new CityName();
        name.setName("Akola");
        name.setRollNo(12);
        String obj = name.getName();
        System.out.println(obj);
        int obj1 = name.getRollNo();
        System.out.println(obj1);

    }
}
