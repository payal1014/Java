package OOPS.Inheritance.SingleLevelInheritance;

public class Cat extends Animal {
    public void makeSound(){
        System.out.println("The cat Quarrels");
    }
    public static void main(String[] args){
        Animal sound = new Animal();
        sound.makeSound();
        Cat sou = new Cat();
        sou.makeSound();

    }
}
