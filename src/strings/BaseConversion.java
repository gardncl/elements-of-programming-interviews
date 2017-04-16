package strings;

public class BaseConversion {

    /*
    7.2

    Write a program that performs base conversion.
    The input is a string, an integer b1, and another
    integer b2. The string represents an integer in
    base b1. The output should be the string representing
    the integer in base b2. Assume 2 <= b1, b2 <= 16.
    Use "A" to represent 10, "B" for 11,..., and "F" for 15.
     */

    public static String baseConversion(String s, int b1, int b2) {
        char[] c = s.toCharArray();
        boolean neg = c[0] == '-';
        int total = 0;
        for (int i  = neg ? 1 : 0; i < c.length; i++) {
            total *= b1;
            total += Character.isDigit(c[i]) ? Character.getNumericValue(c[i])
                            : 10 + (c[i] - 'A');
        }

        return (neg ? "-" : "") + (total == 0 ? "0" : constructFromBase(total, b2));
    }

    private static String constructFromBase(int num, int base) {
        int curr = num % base;
        return num == 0 ? "" : constructFromBase(num / base, base) +
                (char)(curr > 9 ? 'A' + curr - 10 : '0' + curr);

    }


}
