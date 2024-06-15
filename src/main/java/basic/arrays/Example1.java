package basic.arrays;

/*Write a Java program code to count the number of elements
strictly greater than an element X in a non-zero array. */

public class Example1 {

    public static int getResolved(int[] arr) {
        int  input = 3;
        int count = 0;
        for (int j : arr) {
            if (j > input) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        int resolved = getResolved(arr);
        System.out.println("Count = " + resolved);
    }
}
