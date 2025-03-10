package Tasks;

/*
        Task 10
    You are given a 0-indexed array of integers nums
    of length n. You are initially positioned at nums[0].
    Each element nums[i] represents the maximum length of a
    forward jump from index i. In other words, if you are
    at nums[i], you can jump to any nums[i + j] where:
        0 <= j <= nums[i] and
        i + j < n
    Return the minimum number of jumps to reach nums[n - 1].
    The test cases are generated such that you can reach nums[n - 1].

    Example:
    Input: nums = [2,3,1,1,4]       Output: 2
    Explanation: The minimum number of jumps to reach the last index
    is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class IIJumpGame {
    public static int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > farthest) {
                farthest = i + nums[i];
            }
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }

    //    //    Code for main to test the methods
    //    int[] nums = new int[] { 2, 3, 1, 1, 4 };
    //    int k = jump(nums);
    //    System.out.println(k);
}
