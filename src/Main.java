
import static Tasks.MajorityElement.majorityElement;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 2, 3, 3, 1, 1, 1, 1, 3, 3, 4, 3 };
        int k = majorityElement(nums);
        System.out.println(k);
    }
}