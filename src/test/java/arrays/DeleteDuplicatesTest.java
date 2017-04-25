package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteDuplicatesTest {

    private List<Integer> duplicates;
    private List<Integer> noDuplicates;
    private int validElements;

    @Test
    public void deleteDuplicates1() {
        duplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        noDuplicates = Arrays.asList(1, 2, 3, 4, null, null, null, null, null, null);
        validElements = 4;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicates2() {
        duplicates = Arrays.asList(1);
        noDuplicates = Arrays.asList(1);
        validElements = 1;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicates3() {
        duplicates = Arrays.asList(1, 1, 1, 1, 1);
        noDuplicates = Arrays.asList(1, null, null, null, null);
        validElements = 1;

        test(duplicates, noDuplicates, validElements);
    }

    private void test(List<Integer> duplicates, List<Integer> noDuplicates, int validElements) {
        Assertions.assertEquals(validElements, arrays.DeleteDuplicates.deleteDuplicates(duplicates));
        assertEquals(noDuplicates, duplicates);
    }
}