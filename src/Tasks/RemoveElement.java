package Tasks;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
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
