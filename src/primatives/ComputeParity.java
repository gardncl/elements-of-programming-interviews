package primatives;

public class ComputeParity {

    /*
    Compute the parity of a 64-bit word.
     */

    private static short[] CACHE = new short[]{0,1,1,0};
    private static int MASK = 3;
    private static int WORD_SIZE = 16;

    public static short parity(long n) {
        return(short)( CACHE[(int)(n>>>(3*WORD_SIZE) & MASK)]
                ^ CACHE[(int)(n>>>(2*WORD_SIZE) & MASK)]
                ^ CACHE[(int)(n>>>WORD_SIZE & MASK)]
                ^ CACHE[(int)(n & MASK)]);
    }
}
