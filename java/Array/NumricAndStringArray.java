package Array;

import java.util.Arrays;

public class NumricAndStringArray {
    public static void main(String[] args){
        int[] my_array1 = {121,144,196,169,329};
        String[] my_array2 = {"Java","Python","C#","C Programming"};


        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("sorted string array : "+Arrays.toString(my_array2));

    }
}
