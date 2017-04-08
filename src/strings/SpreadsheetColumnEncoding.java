package strings;

public class SpreadsheetColumnEncoding {

    /*
    Implement a function that converts a spreadsheet column id
    to the corresponding integer, with "A" corresponding to 1.
    For example, you should return 4 for "D", 27 for "AA", 702 for "ZZ", etc.
     */

    public static int decodeSpreadsheetColumn(String code) {
        int zero = 'A' - 1;
        int result = 0;
        for (char c : code.toCharArray()) {
            result = (result * 26) + (c - zero);
        }
        return result;
    }


}
