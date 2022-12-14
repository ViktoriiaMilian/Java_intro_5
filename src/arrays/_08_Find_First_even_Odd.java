package arrays;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class _08_Find_First_even_Odd {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 7};
        printFirstEvenAndOdd(numbers);


        /*
        Create a public static method which takes int array end will print out
        the first even and first odd number.

        Example:
        -array = {0 ,5, 3, 2, 4, 7, 10}

        Output 1:
        First even = 0
        First odd = 5

        Example:
        - array =  {0, 2, 2, 5, 3, 2, 4, 7, 10};

        Output 2:
        First even = 0
        First odd = 5

        Example3:
        - array =  {0, 2, 2, 10};

        Output3:
        First even = 0
        There is no odd number in this array

         */


    }
           public static void  printFirstEvenAndOdd(int[] numbers){

           int fEven = 0, fOdd = 0;
           boolean isEvenFound = false, isOddFound = false;

               for ( int n : numbers) {
                   if (!isEvenFound && n % 2 == 0){//if first odd not found and the number is odd
                       fEven = n;
                       isEvenFound = true; // marking flag as true so next time you will  know even has found
                   }else if (!isOddFound && n %2 == 1){ //if first odd not found and the number is odd
                       fOdd = n;
                       isOddFound = true;// marking flag as true so next time you will  know even has found
                   }
               }if (isEvenFound) {
                   System.out.println(" First even = " + fEven);
               }else {
                   System.out.println(" There are no even number is in this array");
               }
               //(condition) ? return this if true : return this false;
               System.out.println((isEvenFound) ? "First even = " + fEven : "There is no even number in this array");
               if (isOddFound) {
                   System.out.println(" First even = " + fOdd);
               }else {
                   System.out.println(" There are no odd number is in this array" );
               }
          }
                  /*
        Create a public static method which will take a String array then it will
        print out the first String starting with "a", NOT CASE SENSITIVE
        If there is not a String which is starting with "a" print -> 'No String starting with "a"'

        Example1:
        - array =  {"ABCD", "abcd", "123", "!@#"}

        Output1:
            First string with "a" = "ABCD"

        Example2:
        - array =  {"abcd", "123", "!@#"}

        Output2:
            First string with "a" = "abcd"

        Example3:
        - array =  {"123", "!@#"}

        Output3:
            No String starting with "a"
         */

    public static void printStartsWithA (String[] strs){

       boolean isAFound = false;
       for (String s : strs) {
           if (s.toLowerCase().startsWith("a") && !isAFound ){
               System.out.println(s);
               isAFound = true;
           }
       }
       if (!isAFound){
           System.out.println(" No String starting with \"a\"");
       }
    }








}
