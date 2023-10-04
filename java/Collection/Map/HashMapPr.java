package Collection.Map;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class HashMapPr {
    public static void main(String[] args){
        HashMap<String,Integer> nameRollNo = new HashMap<>();
        nameRollNo.put("Payal",1);
        nameRollNo.put("Hansika",2);
        nameRollNo.put("Priya",3);
        nameRollNo.put("Anjali",4);
        System.out.println(nameRollNo);

        HashMap<String, String> cityvalue = new HashMap<>();
        cityvalue.put("City","Key");
        cityvalue.put("Name","Value");
        System.out.println(cityvalue);
}
}
