package primatives;

public class MultiplicationNoArithmeticOperators {

    /*
    5.5

    Write a program that multiples two non-negative integers.
    The only operators you are allowed to use are:
        - assignment,
        - bitwise operators >>, <<, |, &, ~, ^, and
        - equality checks and Boolean combinations thereof
    You may use loops and functions that you write yourself.
    These constraints imply, for example, that you cannot
    use increment or decrement, or test if x < y;
     */

    public static long multiply(long x, long y) {
        long result = 0;
        while (x != 0) {
            if ((x & 1) == 1) {
                result = add(result, y);
            }
            x >>>= 1;
            y <<= 1;
        }
        return result;
    }

    private static long add(long a, long b) {
        long result = 0, carryin = 0, k = 1, tempA = a, tempB = b;
        while (tempA != 0 || tempB != 0) {
            //DO THEY MATCH?
            long ak = a & k, bk = b & k;
            //WILL THERE BE A CARRY BIT?
            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);

            result |= (ak ^ bk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            tempA >>>= 1;
            tempB >>>= 1;
        }

        return result | carryin;
    }
}
