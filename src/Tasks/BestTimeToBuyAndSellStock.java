package Tasks;

/*
        Task 7
    You are given an array prices where prices[i]
    is the price of a given stock on the ith day.

    You want to maximize your profit by choosing
    a single day to buy one stock and choosing
    a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this
    transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int minDay = 1;
        int maxProfit = 0;
        int buyDay = 1, sellDay = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minDay = i + 1;
            }

            int currentProfit = prices[i] - minPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                buyDay = minDay;
                sellDay = i + 1;
            }
        }

        if (maxProfit > 0) {
            System.out.printf("Buy on day %d (price = %d) and sell on day %d (price = %d), profit = %d.%n",
                buyDay, prices[buyDay - 1], sellDay, prices[sellDay - 1], maxProfit);
        } else {
            System.out.println("No profitable transaction possible.");
        }

        return maxProfit;
    }
}
