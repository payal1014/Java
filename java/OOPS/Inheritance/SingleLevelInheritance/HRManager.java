package OOPS.Inheritance.SingleLevelInheritance;

public class HRManager extends Employee {
    public HRManager(int salary){
        super(salary);
    }
    public void work(){
        System.out.println("Manageing employees");
    }
    public void addEmployee(){
        System.out.println("Adding new employee!");

    }

    public static void main(String[] args){
        Employee emp = new Employee(40000);
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary() );
        HRManager mgr = new HRManager(70000);
        mgr.work();
        System.out.println("manager salary: " + mgr.getSalary());
        mgr.addEmployee();

    }
}
