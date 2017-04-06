package arrays;

import java.util.List;

public class BuySellStockOnce {

    /*
    Write a program that takes an array denoting the daily stock price,
    and returns the maximum profit that could be made by buying and
    then selling one share of that stock.
     */

    public static int buySellStockOnce(List<Integer> A) {
        Integer profit = 0, min = Integer.MAX_VALUE;
        for (Integer price : A) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}
