import java.util.Arrays;

import Tasks.MergeSortedArrays;

public class Main {

    public static void main(String[] args) {
        int m = 3;
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };

        int n = 3;
        int[] nums2 = new int[] { 2, 5, 6 };

        MergeSortedArrays.merge(nums1, m, nums2, n);
    }
}