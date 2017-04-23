package primatives;

public class ComputeDivision {

    /*
    5.6

    Given two positive integers, compute their quotient,
    using only the addition, subtraction, and shifting operators.
     */

    public static long divide(long x, long y) {
        long result = 0, power = 32;
        long yPower = y << power;
        while (x >= y) {
            while (yPower > x) {
                yPower >>>= 1;
                --power;
            }
            result += 1 << power;
            x -= yPower;

        }
        return result;
    }
}
