package OOPS.Encapsulation;

public class CityName {
    private String name;
    public void setName(String nameOfCity){
        name = nameOfCity;
    }
    public String getName(){
        return name;
    }
    private int rollNo;
    public void setRollNo(int rollNoFromUser){
        rollNo = rollNoFromUser;
    }
    public int getRollNo(){
        return rollNo;
    }
}
