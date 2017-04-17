package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LookAndSayProblem {

    /*
    7.8

    Write a program that takes as input an integer n
    and returns the nth integer in the look-and-say
    sequence. Return the result as a string.
     */

    public static String lookAndSay(int n) {
        List<Integer> returnValue = Arrays.asList(1);
        int count = 0, current = -1;
        for (int i = 1; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (Integer val : returnValue) {
                if (val != current) {
                    if (count > 0){
                        temp.add(count);
                        temp.add(current);
                    }
                    current = val;
                    count = 1;
                } else {
                    count++;
                }
            }
            if (count > 0) {
                temp.add(count);
                temp.add(current);
            }
            count = 0;
            returnValue = new ArrayList<>(temp);
        }

        StringBuilder num = new StringBuilder();
        for (Integer val : returnValue) {
            num.append(val);
        }
        return num.toString();
    }

}
