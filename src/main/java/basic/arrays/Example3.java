package basic.arrays;

/* Write a Java program code to calculate the second largest component present in the array. */
public class Example3 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 2, 10, 34, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        int secondLargest = arr[arr.length - 2];
        System.out.println("Second largest number = " + secondLargest);
    }
}
