package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

        // 1. Create a array to store -> 5.5, 6 10.3, 25
        double[] numbers = {5.5, 6, 10.3, 25};
        // 2. Print the array [5.5, 6, 10.3, 25]
        System.out.println(Arrays.toString(numbers));
        // 3. Print te size of the array - 4
        System.out.println(numbers.length);


        System.out.println("\n --------For each loops---------\n");
        for (double number : numbers){
            System.out.println(number);
        }


    }
}
