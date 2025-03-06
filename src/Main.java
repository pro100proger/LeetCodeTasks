
import static Tasks.IIBestTimeToBuyAndSellStock.maxProfit;
import static Tasks.JumpGame.canJump;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] { 1,5,7,3,6,9 };
        boolean k = canJump(nums);
        System.out.println(k);
    }
}