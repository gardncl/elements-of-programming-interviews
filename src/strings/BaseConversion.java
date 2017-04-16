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
        for (int i = neg ? 1 : 0; i < c.length; i++) {
            total *= b1;
            total += Character.isDigit(c[i])
                    ?c[i] - '0' : c[i] - 'A' + 10 ;
        }
        return (neg ? "-" :  "") + baseConvert(total, b2);
    }

    private static String baseConvert(int total, int base) {
        int curr = total % base;
        return total == 0 ? "" : baseConvert(total / base, base) +
                (char)(curr > 9 ? 'A' + curr - 10 : curr + '0' );
    }


}
