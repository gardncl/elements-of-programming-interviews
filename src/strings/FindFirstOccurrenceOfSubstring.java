package strings;

public class FindFirstOccurrenceOfSubstring {

    /*
    7.13

    Given two strings s (the "search string") and t (the "text"), find the first occurrence of s in t.
     */

    public static int findFirst(String string, String substring) {
        int lastIndex = substring.length() - 1;
        for (int i = lastIndex; i < string.length(); i++) {
            if (string.charAt(i) == substring.charAt(lastIndex)) {
                if (substring.equals(string.substring(i - lastIndex,i+1)))
                    return i - lastIndex;
            }
        }
        return -1;
    }

}
