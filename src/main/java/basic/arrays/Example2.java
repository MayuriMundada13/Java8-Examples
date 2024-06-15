package basic.arrays;

import java.util.Arrays;

/* Write a Java program to insert an element of an array at the end. */
public class Example2 {
    public static int[] getResolved(int[] arr) {
        int input = 90;

        //new array
        int[] newArray = new int[arr.length + 1];

        //creating copy for new Array
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        //insert new element in newArray
        newArray[newArray.length - 1] = input;
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] resolved = getResolved(arr);
        System.out.println(Arrays.toString(resolved)); // Use Arrays.toString() to print array
    }
}
