
import static Tasks.BestTimeToBuyAndSellStock.maxProfit;

public class Main {

    public static void main(String[] args) {
        int[] prices = new int[] { 7,1,5,3,6,4 };
        int k = maxProfit(prices);
        System.out.println(k);
    }
}