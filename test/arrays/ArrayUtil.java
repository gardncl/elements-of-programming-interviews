package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUtil {

    public static List<Integer> sequence(int n) {
        return Arrays.stream(IntStream.range(0, n).toArray()).boxed().collect(Collectors.toList());
    }
}
