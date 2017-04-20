package primatives;

public class SwapBits {

    /*
    5.2

    A 64-bit integer can be viewed as an array of 64 bits,
    with the bit at index 0 corresponding to the least
    significant bit (LSB), and the bit at index 63 corresponding
    to the most significant bit (MSG). Implement code that
    takes as input a 64-bit integer and swaps the bits at indices i and j.
     */

    public static long swapBits(long x, int i, int j) {
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            final long MASK = (1 << i) | (1 << j);
            x ^= MASK;
        }
        return x;
    }
}
