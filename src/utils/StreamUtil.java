package utils;

import java.util.stream.IntStream;

public class StreamUtil {

    public static IntStream revRange(int from, int to) {
        return IntStream.range(from, to).map(i -> to - i + from - 1);
    }

}
