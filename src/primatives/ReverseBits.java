package primatives;

import static primatives.SwapBits.swapBits;

public class ReverseBits {

    /*
    5.3

    Write a program that takes a 64-bit word and returns the
    64-bit word consisting of the bits of the input word in
    reverse order.
     */

    public static int reverse(int x) {
        int i  = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            x = (int)swapBits(x,i++,j--);
        }
        return x;
    }
}
