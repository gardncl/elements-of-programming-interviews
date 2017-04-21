package primatives;

public class CheckIfIntegerIsPalindrome {

    /*
    5.9

    Write a program that takes an integer and determines
    if that integers's representation as a decimal
    string is a palindrome;
     */

    public static boolean isPalindrome(int x) {
        int i = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            if (((x >>> i++) & 1) != ((x >>> j--) & 1)) {
                return false;
            }
        }
        return true;
    }
}
