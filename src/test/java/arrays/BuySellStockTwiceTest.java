package arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStockTwiceTest {
    private List<Integer> prices;
    private int maxProfit;

    @Test
    public void buySellStockTwice1() {
        prices = Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250);
        maxProfit = 55;

        test(prices, maxProfit);
    }

    @Test
    public void buySellStockTwice2() {
        prices = Arrays.asList(100, 200);
        maxProfit = 100;

        test(prices, maxProfit);
    }

    @Test
    public void buySellStockTwice3() {
        prices = Arrays.asList(200, 100);
        maxProfit = 0;

        test(prices, maxProfit);
    }

    @Test
    public void buySellStockTwice4() {
        prices = Arrays.asList(2, 4, 2, 6, 3, 0, 5);
        maxProfit = 9;

        test(prices, maxProfit);
    }

    private void test(List<Integer> prices, int maxProfit) {
        assertEquals(maxProfit, arrays.BuySellStockTwice.buySellStockTwice(prices));
    }


}