package Tasks;

import java.util.Arrays;

/*
        Task 6
    Given an integer array nums, rotate the array
    to the right by k steps, where k is non-negative.

    Example:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    //  First variant
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    //    //  Second variant with bad time complexity O(n*k)
    //    public static void rotate(int[] nums, int k) {
    //        k = k % nums.length;
    //        for (int i = 0; i < k; i++) {
    //            int lastElement = nums[nums.length - 1];
    //            for (int j = nums.length - 1; j > 0; j--) {
    //                nums[j] = nums[j - 1];
    //            }
    //            nums[0] = lastElement;
    //            System.out.println(Arrays.toString(nums));
    //        }
    //    }

    //    //    Code for main to test the methods
    //    int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    //    int k = 3;
    //    rotate(nums, k);
}
