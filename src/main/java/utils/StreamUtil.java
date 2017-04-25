package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamUtil {

    public static IntStream revRange(int from, int to) {
        return IntStream.range(from, to).map(i -> to - i + from - 1);
    }

    public static List<Integer> sequence(int n) {
        return Arrays.stream(IntStream.range(0, n).toArray()).boxed().collect(Collectors.toList());
    }

    public static List<Integer> shuffle(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }


}
