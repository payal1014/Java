package Programm;

import java.util.HashSet;

public class DuplicateElementFromArray {
    public static void main(String[] args){
        String name[] = {"Payal","Hansika","Priya","Rohini","Payal"};
        HashSet<String> na = new HashSet<>();
        for (String element:name){
            if(na.add(element)==false){
                System.out.println("Duplicate element is " + element);
            }
        }


        int nu[] = {1,2,3,4,3,5,};
        HashSet<Integer> num = new HashSet<>();
        for(int element : nu){
            if(num.add(element)==false){
                System.out.println("Duplicate integer is " + element);
            }
        }

        String city[] = {"Nagpur","Amravati","Pune","Nagpur"};
        HashSet<String> dup = new HashSet<>();
        for(String element : city){
            if(dup.add(element)==false){
                System.out.println("Duplicate String is " + element);
            }
        }

        String name1[] = {"Pranjali","Hansika","Anjali","Pranjali"};
        HashSet<String> abc = new HashSet<>();
        for (String element : name1){
            if(abc.add(element)==false){
                System.out.println("Duplicate String is " + element);
            }
        }

        String n[] = {"Payal","Amita","Anjali","Amita",};
        HashSet<String> ab = new HashSet<>();
        for(String element:n){
            if(ab.add(element)==false){
                System.out.println("Duplicate String is " + element);
            }
        }

    }
}
