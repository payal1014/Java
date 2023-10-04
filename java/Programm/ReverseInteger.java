package Programm;

public class ReverseInteger {
    public static void main(String[] args){
        int no = 123456;
        int no1 = 0;
        while(no!=0){
            no1 = no1*10 + no%10;
            no = no/10;
        }
       System.out.println(no1);

        int a = 1234567;
        int b = 0;
        while(a!=0){
            b = b*10 + a%10;
            a = a/10;
        }
        System.out.println(b);

        int a1 = 4321;
        int a2 = 0;
        while(a1!=0){
            a2 = a2*10 + a1%10;
            a1 = a1/10;
        }
        System.out.println(a2);

        int c = 54321;
        int d = 0;
        while(c!=0){
            d = d*10 + c%10;
            c = c/10;

        }
        System.out.println(d);

        int no3 = 124568;
        int no4 = 0;
        while(no3!=0){
            no4=no4*10 + no3%10;
            no3=no3/10;
        }
        System.out.println(no4);

        int m = 7856412;
        int p = 0;
        while (m!=0){
            p = p*10 + m%10;
            m = m/10;
        }
        System.out.println(p);

        int ab = 546879;
        int cd = 0;
        while (ab!=0){
            cd = cd*10+ab%10;
            ab = ab/10;
        }
        System.out.println(cd);

    }

}
