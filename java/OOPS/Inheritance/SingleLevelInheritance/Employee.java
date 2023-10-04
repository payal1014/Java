package OOPS.Inheritance.SingleLevelInheritance;

public class Employee {
    private int salary;

    public Employee(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("working as an employee!");
    }
    public int getSalary(){
        return salary;
    }
}
