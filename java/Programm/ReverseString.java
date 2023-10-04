package Programm;

public class ReverseString {
    public static void main(String[] args){
        String name = "Hansika";
        String name1 = " ";
        for(int i = 0; i<name.length(); i++){
            System.out.print(name.charAt(i));

        }

        for (int i = name.length()-1;i>=0;i--){
            name1 = name1+name.charAt(i);

        }
        System.out.println(name1);

        String a = "Nikhil";
        String b = " ";
        for (int i =0; i<a.length();i++){

        }
        for (int i = a.length()-1;i>=0;i--){
            b = b+a.charAt(i);
        }
        System.out.println(b);

        String c = "Pooja";
        String d = " ";
        for(int i = 0; i<c.length();i++){
            System.out.println(c.charAt(i));
        }
        for (int i = c.length()-1;i>=0;i--){
            d = d+c.charAt(i);
        }
        System.out.println(d);

        String e = "Amravti";
        String f = " ";
        for (int i = 0;i<e.length();i++){
            System.out.println(e.charAt(i));
        }
        for (int i = e.length()-1;i>=0;i--){
            f = f+e.charAt(i);
        }
        System.out.println(f);


        String nam = "Anjali";
        String ma = " ";
        for(int i = 0;i<nam.length();i++){
            System.out.print(nam.charAt(i));
        }
        for(int i=nam.length()-1;i>=0;i--){
            ma = ma+nam.charAt(i);
        }
        System.out.println(ma);

    }

}

