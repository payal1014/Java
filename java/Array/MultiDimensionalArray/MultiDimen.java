package Array.MultiDimensionalArray;

public class MultiDimen {
    public static void main(String[]args){
        String[][] stateCity ={{"Maharashtra","Akola"},{"MadhyaPrades","Indore"},{"UttarPradesh","Lackhow"},{"Punjab","Amrutsar"}};
        System.out.println(stateCity[0][0]);
        System.out.println(stateCity[0][1]);
        System.out.println(stateCity[2][0]);
        System.out.println(stateCity[2][1]);

        String groupMember[][] = new String[3][2];
        groupMember[0][0] = "Payal";
        groupMember[0][1] = "1";
        groupMember[1][0] = "Monika";
        groupMember[1][0] = "2";
        groupMember[2][0] = "Hansika";
        groupMember[2][1] = "3";
        System.out.println(groupMember[2][0]);
        System.out.println(groupMember[2][1]);

        int evenNo[][] = new int[5][2];
        evenNo[0][0] = 2;
        evenNo[0][1] = 4;
        evenNo[1][0] = 6;
        evenNo[1][1] = 8;
        evenNo[2][0] = 10;
        evenNo[2][1] = 12;
        evenNo[3][0] = 14;
        evenNo[3][1] = 16;
        evenNo[4][0] = 18;
        evenNo[4][1] = 20;
        System.out.println(evenNo[3][1]);

        for (int i = 0;i<evenNo.length;i++){
            for (int a = 0;a<2;a++){
                System.out.println(evenNo[i][a]);
            }
        }


    }
}
