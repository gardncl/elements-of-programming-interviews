package strings;

public class ReplaceAndRemove {

    /*
    Write a program which takes as input an array of characters,
    and removes each 'b' and replaces each 'a' by two 'd's.
    Specifically, along with the array, you are provided an
    integer-valued size. Size denotes the number of entries of
    the array that the operation is to be applied to. You do not
    have to worry preserving about subsequent entries. For example,
    if the array is [a, b, a, c, _] and the size is 4, then you can
    return [d, d, d, d, c]. You can assume there is enough space
    in the array to hold the final result.
     */

    public static String replaceAndRemove(char[] s, int k) {
        int a = 0, writeIndex = 0;
        for (int i = 0; i < k; i++) {
            if (s[i] != 'b') {
                s[writeIndex++] = s[i];
            }
            if (s[i] == 'a') {
                a++;
            }
        }
        int currentIndex = writeIndex - 1;
        writeIndex = writeIndex + a - 1;
        while (currentIndex >= 0) {
            if (s[currentIndex] == 'a') {
                s[writeIndex--] = 'd';
                s[writeIndex--] = 'd';
            } else {
                s[writeIndex--] = s[currentIndex];
            }
            --currentIndex;
        }
        return String.copyValueOf(s);
    }

}
