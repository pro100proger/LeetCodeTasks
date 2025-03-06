
import static Tasks.JumpGame.canJump;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 3,2,1,0,4 };
        boolean k = canJump(nums);
        System.out.println(k);
    }
}