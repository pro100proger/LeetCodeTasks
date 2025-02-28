package Tasks;

import java.util.Arrays;

public class MergeSortedArrays {
    // First variant
    //        public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //            for (int i = m, j = 0; i < m + n; i++, j++) {
    //                nums1[i] = nums2[j];
    //            }
    //            Arrays.sort(nums1);
    //            System.out.println(Arrays.toString(nums1));
    //        }

    // Second variant
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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

//    Code for main to test the methods
//    int m = 3;
//    int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
//
//    int n = 3;
//    int[] nums2 = new int[] { 2, 5, 6 };
//
//        MergeSortedArrays.merge(nums1, m, nums2, n);
}
