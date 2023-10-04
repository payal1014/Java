package Constructor;

public class Bike1 {
    String model;
    String color;
    String brand;
    int year;
    int price;
    Bike1(){
        System.out.println("It is default constructo");
    }
    Bike1(String model,int year){
        System.out.println("This is paramaterized constructor");
        System.out.println("model is " + model);
        System.out.println("year is " + year);
    }

    Bike1(String model,String color,int price){
        System.out.println("model is " + model + " color is " + color + " Price is " + price);
    }
    public static void main(String[] args){
        Bike1 obj = new Bike1();
        Bike1 pulsar = new Bike1("pulsar",2019);
        Bike1 activa =  new Bike1("Activa","Black", 110000);
    }
}
