package Array.MultiDimensionalArray;

public class MultiDimensionArray2 {
    public static void main(String[] args) {
        String[][] cityNo = {{"Akola,1"}, {"Nagpur,2"}, {"Pune,3"}, {"Amravati,4"}};
        System.out.println(cityNo[0][0]);
        System.out.println(cityNo[2][0]);

        int[][] num = new int[4][3];
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[1][0] = 10;
        num[1][1] = 11;
        num[1][2] = 12;
        num[2][0] = 15;
        num[2][1] = 16;
        num[2][2] = 17;
        num[3][0] = 20;
        num[3][1] = 21;
        num[3][2] = 22;
        System.out.println(num[0][2]);
    }
}
