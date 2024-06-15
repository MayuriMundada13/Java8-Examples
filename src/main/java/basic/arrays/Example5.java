package basic.arrays;
/* Reverse a given array of size N. */
public class Example5 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
