package arrays;

import java.util.List;

public class BuySellStockTwice {

    /*
    Write a program that computes the maximum profit that can
    be made by buying and selling a share at most twice. The
    second buy must be made on another date after the first sale.
     */

    public static int buySellStockTwice(List<Integer> A) {
        Integer a1 = 0, b1 = 0, p1 = 0;
        Integer a2 = 0, b2 = 0, p2 = 0;
        Integer min = Integer.MAX_VALUE, minIndex = 0;
        Integer profit = 0;
        Integer pTotal = p1 + p2;
        Integer i = 0;
        for( Integer price : A) {
            if (price < min) {
                min = price;
                minIndex = i;
            }
            profit = Math.max(profit, price - min);
            if (profit > p2 && (profitBetweenPoints(a1, b2, A) >= profitBetweenPoints(a2, b2, A))) {
                b1 = b2;
                a2 = minIndex;
                b2 = minIndex;
            } else if(profit > p2) {

            }
            p1 = profitBetweenPoints(a1, b1, A);
            p2 = profitBetweenPoints(a2, b2, A);
            i++;
        }
        return p1 + p2;
    }

    private static int profitBetweenPoints(int a, int b, List<Integer> A) {
        return A.get(b) - A.get(a);
    }
}
