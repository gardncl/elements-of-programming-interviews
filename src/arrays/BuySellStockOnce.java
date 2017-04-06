package arrays;

import java.util.List;

public class BuySellStockOnce {

    /*
    Write a program that takes an array denoting the daily stock price,
    and returns the maximum profit that could be made by buying and
    then selling one share of that stock.
     */

    public static int buySellStockOnce(List<Integer> A) {
        int profit = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            //NEW MAX
            if (A.get(i) > max) {
                max = A.get(i);
            }
            //RESET THE INCREASING SEQUENCE
            if (A.get(i) < min) {
                min = A.get(i);
                max = min;
            }
            //SET NEW LARGEST PROFIT
            if ((max - min) > profit){
                profit = max - min;
            }
        }

        return profit;
    }
}
