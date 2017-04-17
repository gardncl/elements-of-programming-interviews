package strings;

public class ReverseWordsInASentence {

    /*
    7.6

    Implement a function for reversing the words in a string s.
     */

    public static String reverseWordsInASentence(String input) {
        StringBuilder sentence = new StringBuilder();
        String[] words = input.split(" ");
        int i = words.length;
        while (i-- > 0)
            sentence.append(words[i]+" ");r
        return sentence.toString().trim();
    }
}
