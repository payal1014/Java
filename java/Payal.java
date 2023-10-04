public class Payal {
    String name;
    int noo;

    public Payal(){
        //non parameterized constructor

    }
    public Payal(String name){
      //here we applying method overloading concept
    }
    public Payal(String name1,int no){
       name=name1;
       noo=no;
     // here is a example to initialize the variable
    }
    public static void main(String[] args){
        Payal obj = new Payal("Nikhil",20);
        System.out.println(obj.name);
        System.out.println(obj.noo);

    }

}
