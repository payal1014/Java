package Array;

public class OneDimensionalArray {
    public static void main(String[] args) {
        String name[] = {"Payal", "Monika", "Priya", "Hansika", "Anjali"};
        System.out.println("First name is " + name[0]);
        String nameAtThirdPlace = name[2];
        System.out.println(nameAtThirdPlace);

        int no[] = {1, 2, 3, 4, 5, 6};
        System.out.println(no[3]);
        System.out.println("Second no is " + no[1]);
        int noAtFirstPlace = no[0];
        System.out.println(noAtFirstPlace);


        String city[] = new String[5];
        city[0] = "Akola";
        city[1] = "Amravati";
        city[2] = "Wardha";
        city[3] = "Nagpur";
        city[4] = "Pune";
        System.out.println(city[4]);

        int oddNo[] = new int[6];
        oddNo[0] = 1;
        oddNo[1] = 3;
        oddNo[2] = 5;
        oddNo[3] = 7;
        oddNo[4] = 9;
        oddNo[5] = 11;
        System.out.println(oddNo[4]);

        char alpha[] = new char[6];
        alpha[0] = 'a';
        alpha[1] = 'b';
        alpha[2] = 'c';
        alpha[3] = 'd';
        alpha[4] = 'e';
        alpha[5] = 'f';
        System.out.println("first alphabet is " + alpha[0]);




    }


}
