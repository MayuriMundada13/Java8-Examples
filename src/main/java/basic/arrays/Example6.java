package basic.arrays;

import java.util.Arrays;

/* Median of Two Sorted Arrays
  Input: nums1 = [1,3], nums2 = [2]
  Output: 2.00000
  Explanation: merged array = [1,2,3] and median is 2.
*/
public class Example6 {
    public static void main(String[] args) {
        /*
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        */

        /* input 2 */
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        //creating new array
        int[] newArray = new int[nums1.length + nums2.length];

        //creating copy of array
        for (int i = 0; i < nums1.length; i++) {
            newArray[i] = nums1[i];
        }

        int startIndex = newArray.length - nums2.length;
        for (int i = 0; i < nums2.length; i++) {
            newArray[startIndex + i] = nums2[i];
        }

        Arrays.sort(newArray);

        double output = 0;
        if(newArray.length % 2 == 0) {
            int middleIndex1 = (newArray.length / 2) - 1;
            int middleIndex2 = newArray.length / 2;

            output = (newArray[middleIndex1] + newArray[middleIndex2]) / 2.0;
        } else{
           int middleIndex = newArray.length / 2;
           output = (newArray[middleIndex]);
        }

        System.out.println(output);
    }
}
