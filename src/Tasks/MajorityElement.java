package Tasks;

/*
        Task 5
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    // Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0], numberOfMajorityElement = 0;
        for (int num : nums) {
            if (numberOfMajorityElement == 0) {
                majorityElement = num;
            }

            if (num == majorityElement) {
                numberOfMajorityElement++;
            } else {
                numberOfMajorityElement--;
            }
        }

        return majorityElement;
    }

    // Second variant with bad time complexity O(n^2)
    //    public static int majorityElement(int[] nums) {
    //        int majorityElement = nums[0];
    //        int numberOfMajorityElement = 0;
    //        for (int i = 0; i < nums.length; i++) {
    //            int currentNumberOfElement = 0;
    //            for (int j = 1; j < nums.length; j++) {
    //                if (nums[i] == nums[j]) {
    //                    currentNumberOfElement++;
    //                }
    //            }
    //            if (currentNumberOfElement > numberOfMajorityElement) {
    //                majorityElement = nums[i];
    //                numberOfMajorityElement = currentNumberOfElement;
    //            }
    //        }
    //        return majorityElement;
    //    }

    //    //    Code for main to test the methods
    //    int[] nums = new int[] { 1, 3, 2, 3, 3, 1, 1, 1, 1, 3, 3, 4, 3 };
    //    int k = majorityElement(nums);
    //        System.out.println(k);
}
