package Tasks;

import java.util.Arrays;

/*
        Task 2
    Given an integer array nums and an integer val,
    remove all occurrences of val in nums in-place.
    The order of the elements may be changed.
    Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k,
    to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums
    contain the elements which are not equal to val. The remaining
    elements of nums are not important as well as the size of nums.
    Return k.
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if (nums.length <= 2) return nums.length;

        int countVal = 0, occupiedPlace = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                countVal++;
            } else {
                if (countVal == 0) {
                    occupiedPlace++;
                } else {
                    nums[occupiedPlace++] = nums[i];
                    nums[i] = val;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - countVal;
    }

    ////    Short variant with mess in array
    //    public static int removeElement(int[] nums, int val) {
    //        int k = 0;
    //        for (int i = 0; i < nums.length; i++) {
    //            if (nums[i] != val) {
    //                nums[k++] = nums[i];
    //            }
    //        }
    //        return k;
    //    }

    ////    Code for main to test the methods
    //    int[] nums = new int[] { 0,1,2,2,3,0,4,2 };
    //    int val = 2;
    //
    //    int k = removeElement(nums, val);
}
