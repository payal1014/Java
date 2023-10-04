package OOPS.Polymarphism.RunTime;

public class SubClass extends SuperClass{
    public void home(){
        System.out.println("Sub class have 1 home");
    }
    public void led(){
        System.out.println("Sub class have 2 led");
    }
    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.home();
        obj.led();
        obj.flat();

        SuperClass obj1 = new SuperClass();
        obj1.home();
        obj1.led();
        obj1.flat();

    }
}
