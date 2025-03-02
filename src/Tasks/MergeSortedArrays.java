package Tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
        Task 1
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be
    stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
    where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArrays {

    ////      First variant with bad time complexity
    //        public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //            for (int i = m, j = 0; i < m + n; i++, j++) {
    //                nums1[i] = nums2[j];
    //            }
    //            Arrays.sort(nums1);
    //            System.out.println(Arrays.toString(nums1));
    //        }

    // Second variant
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length <= 2) return;
        if (nums2.length <= 2) return;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    ////   Third variant with streams
    //    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //        nums1 = IntStream.concat(Arrays.stream(nums1, 0, m), Arrays.stream(nums2))
    //            .sorted()
    //            .toArray();
    //
    //        System.arraycopy(nums1, 0, nums1, 0, m + n); // Запис назад у nums1
    //        System.out.println(Arrays.toString(nums1));
    //    }


    ////    Code for main to test the methods
    //    int m = 3;
    //    int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
    //
    //    int n = 3;
    //    int[] nums2 = new int[] { 2, 5, 6 };
    //
    //        MergeSortedArrays.merge(nums1, m, nums2, n);
}
