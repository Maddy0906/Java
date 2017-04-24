package Java;

import java.util.Scanner;


public class Assignment4 {

    public static void main(String[] args) {
	// write your code here

        //Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();
        year++;

        while (!distinctDigits(year)) {
            year++;
        }

        System.out.println(year);

    }

    /* returns true if all digits in parameter integer are distinct; false otherwise */
    public static boolean distinctDigits(int year) {
        String s = String.valueOf(year); // string representation of the number
        int[] numbers = new int[10]; // index position represents number, element value represents occurrence of that number

        for (int i = 0; i < s.length(); i++) {
            int x = Integer.parseInt(s.substring(i, i+1)); // integer at this part in the string
            numbers[x]= numbers[x]+1; // increase occurrence of this integer in the array
        }

        // check if any digit occurred more than once in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1) { // digit occurred more than once
                return false; // not distinct
            }
        }
        return true; // hasn't returned false yet, so the integer has distinct digits
    }
}

