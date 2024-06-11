package basic.leetcode;

import java.util.Arrays;

public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int[] sortedArr1 = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                sortedArr1[index++] = num;
                count[num]--;
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortedArr1[index++] = i;
                count[i]--;
            }
        }
        return sortedArr1;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] ints = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ints));
    }
}

