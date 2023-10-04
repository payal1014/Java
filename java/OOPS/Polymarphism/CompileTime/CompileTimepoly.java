package OOPS.Polymarphism.CompileTime;

public class CompileTimepoly {

    public void method(){ }
    public void method(String city){ }
    public void method(int no,String name){ }
    public void method(int a, int b){ }
    public void method(String name1,String name2){
        System.out.println("Name of city is:" + name1 + " name of another city is: " + name2);
    }
    public void method1(int no){
        System.out.println(no);
    }
    public void method1(int no,int no1){
        System.out.println(no+no1);
    }

    public static void main(String[] args){
        CompileTimepoly method = new CompileTimepoly();
        method.method1(12);
        method.method("Akola","Nagpur");



    }
}
