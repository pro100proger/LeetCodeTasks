
import static Tasks.IIBestTimeToBuyAndSellStock.maxProfit;

public class Main {

    public static void main(String[] args) {
        int[] prices = new int[] { 1,5,7,3,6,9 };
        int k = maxProfit(prices);
        System.out.println(k);
    }
}