package Tasks;

/*
        Task 9
    You are given an integer array nums. You are
    initially positioned at the array's first index,
    and each element in the array represents your
    maximum jump length at that position.
    Return true if you can reach the last index, or false otherwise.

    Example:
    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;

        int remainingLength = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= remainingLength) {
                remainingLength = i;
            }
        }
        return remainingLength == 0;
    }
}
