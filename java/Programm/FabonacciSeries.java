package Programm;

public class FabonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 0;i<10;i++){
            sum=a+b;
            System.out.println(" "+sum);
            a=b;
            b=sum;
        }

        int c = 0;
        int d = 1;
        int sum1 = 0;
        for(int i = 0;i<15;i++){
            sum1 = c+d;
            System.out.println(" "+sum1);
            c=d;
            d=sum1;
        }

    }
}
