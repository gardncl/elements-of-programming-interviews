package strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    /*
    7.9

    Write a program which takes as input a valid Roman number
    string s and returns the integer it corresponds to.
     */

    private static Map<Character, Integer> valueMap;

    public static int romanToDecimal(String roman) {
        int sum = valueMap.get(roman.charAt(roman.length() - 1));
        for (int i = roman.length() - 2; i >= 0; --i) {
            if (valueMap.get(roman.charAt(i)) < valueMap.get(roman.charAt(i + 1)))
                sum -= valueMap.get(roman.charAt(i));
            else
                sum += valueMap.get(roman.charAt(i));
        }
        return sum;
    }

    static {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        valueMap = Collections.unmodifiableMap(map);
    }
}
