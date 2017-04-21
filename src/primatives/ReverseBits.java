package primatives;

public class ReverseBits {

    /*
    5.3

    Write a program that takes a 64-bit word and returns the
    64-bit word consisting of the bits of the input word in
    reverse order.
     */

    public static long reverse(long x) {
        long returnValue = 0;
        for (int i = 0; i < 64; i++) {
            returnValue ^= (x >>> (63 - i)) ^ 1;
            returnValue <<= 1;
        }
        return returnValue;
    }
}
