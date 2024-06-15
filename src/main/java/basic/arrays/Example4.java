package basic.arrays;

/* Write a Java program to count the number of elements in an array. */
public class Example4 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        int input = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println("Count = " + count);
            }
            count++;
        }
    }
}
