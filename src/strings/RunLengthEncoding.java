package strings;

public class RunLengthEncoding {

    /*
    7.12

    Implement run-length encoding and decoding functions.
    Assume the string to be encoded consists of letters of
     the alphabet, with no digits, and the string to be
     decoded is a valid encoding.
     */

    public static String encode(String s) {
        StringBuilder code = new StringBuilder();

        int n = 0;
        char current = ' ';
        for (char c : s.toCharArray()) {
            if (c == current) {
                n++;
            } else if (n > 0){
                code.append(n);
                code.append(current);
                current = c;
                n = 1;
            } else {
                current = c;
                n = 1;
            }
        }
        if (n > 0){
            code.append(n);
            code.append(current);
        }

        return code.toString();
    }

    public static String decode(String s) {
        StringBuilder message = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                n = c - '0';
            else {
                while (n-- > 0)
                    message.append(c);
            }
        }
        return message.toString();
    }

}
