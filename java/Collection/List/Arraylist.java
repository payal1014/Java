package Collection.List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Akola");
        cityName.add("Nagpur");
        cityName.add("Amravati");
        cityName.add("Pune");
        cityName.add("Wardha");
        cityName.add(null);
        cityName.remove("Akola");
        cityName.remove(2);
        System.out.println(cityName);

        cityName.set(0,"Pune");
        System.out.println(cityName);



    }
}
