package Programm;

import java.util.HashSet;

public class DuplicateCharInString {
    public static void main(String[] args){
        String name1 = "Payal";
        HashSet<Character> setOfChar1 = new HashSet<>();
        for(int i =0; i<name1.length();i++) {
            char ab = name1.charAt(i);
            if (setOfChar1.add(ab) == false) {
                System.out.println("Duplicate character is " + ab);
            }
        }

        String city = "Akola";
        HashSet<Character> setOfChar = new HashSet<>();
        for(int i = 0;i<city.length();i++){
            char ab1 = city.charAt(i);
            if(setOfChar.add(ab1)==false){
                System.out.println("Duplicate character is " + ab1);
            }
        }

        String a = "Nikhil";
        HashSet<Character> name = new HashSet<>();
        for(int i = 0;i<a.length();i++){
            char abc = a.charAt(i);
            if(name.add(abc)==false){
                System.out.println("Duplicate character is " + abc);
            }
        }


        String b = "Pooja";
        HashSet<Character> cha = new HashSet<>();
        for(int i = 0;i<b.length();i++){
            char ab = b.charAt(i);
            if(cha.add(ab)==false){
                System.out.println("Duplicate character is " + ab);
            }
        }
        String c = "javanjal";
        HashSet<Character> dup = new HashSet<>();
        for(int i = 0;i<c.length();i++){
            char abc = c.charAt(i);
            if(dup.add(abc)==false){
                System.out.println("Duplicate character is " + abc);
            }
        }
        String d = "Anjali";
        HashSet<Character> bupl = new HashSet<>();
        for(int i =0;i<d.length();i++){
            char cd = d.charAt(i);
            if(bupl.add(cd)==false){
                System.out.println("Duplicate Character is " + cd);
            }
        }
    }
}
