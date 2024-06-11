package basic.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //way 1
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSum s = new TwoSum();
        int[] ints = s.twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

}