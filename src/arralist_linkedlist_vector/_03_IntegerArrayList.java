package arralist_linkedlist_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

        /*
        Create array list to store bellow numbers
        10
        15
        20
        10
        20
        30
        Print ArrrayList  and Print Size
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(numbers.size());

        // remove all 10 ( in this case it is object)
        while (numbers.contains(10)){
            numbers.remove((Integer)10);
        }
        System.out.println(numbers);

        System.out.println("\n -----------Contains method----------\n");

        System.out.println(numbers.contains(10));// true
        System.out.println(numbers.contains(12));// false
        System.out.println(numbers.contains(20));//false
        System.out.println(numbers.contains(22));//true

        System.out.println("\n -----------IndexOf() method----------\n");

        System.out.println(numbers.indexOf(15));//1
        System.out.println(numbers.indexOf(25));//-1
        System.out.println(numbers.indexOf(20));//2
        System.out.println(numbers.indexOf(30));//5

        System.out.println("\n -----------LastIndexOf() method----------\n");

        System.out.println(numbers.lastIndexOf(30));//5
        System.out.println(numbers.lastIndexOf(35));//-1
        System.out.println(numbers.lastIndexOf(10));//3

        System.out.println("\n -----------Retriving each element for i loop----------\n");

        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(4);
        numbers.get(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("\n -----------Retrieving each element with foeeach loop----------\n");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
