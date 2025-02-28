import java.util.Arrays;

import Tasks.MergeSortedArrays;
import static Tasks.RemoveElement.removeElement;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 0,1,2,2,3,0,4,2 };
        int val = 2;

        int k = removeElement(nums, val);
    }
}