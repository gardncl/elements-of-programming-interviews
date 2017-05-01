import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class RemoveFirstNameDuplicatesTest {

    private List<String> expected;
    private List<RemoveFirstNameDuplicates.Name> A;

    @Test
    public void eliminateDuplicates1() throws Exception {
        expected = Arrays.asList("Ian", "David");
        A = Arrays.asList(
                new RemoveFirstNameDuplicates.Name("Ian","Botham"),
                new RemoveFirstNameDuplicates.Name("David","Gower"),
                new RemoveFirstNameDuplicates.Name("Ian","Bell"),
                new RemoveFirstNameDuplicates.Name("Ian","Chappell")
        );

        test(expected, A);
    }

    @Test
    public void eliminateDuplicates2() throws Exception {
        expected = Arrays.asList("Ian");
        A = Arrays.asList(
                new RemoveFirstNameDuplicates.Name("Ian","Botham"),
                new RemoveFirstNameDuplicates.Name("Ian","Bell"),
                new RemoveFirstNameDuplicates.Name("Ian","Chappell")
        );

        test(expected, A);
    }

    @Test
    public void eliminateDuplicates3() throws Exception {
        expected = Arrays.asList("Ian", "David", "Chazz");
        A = Arrays.asList(
                new RemoveFirstNameDuplicates.Name("Ian","Botham"),
                new RemoveFirstNameDuplicates.Name("David","Gower"),
                new RemoveFirstNameDuplicates.Name("Ian","Bell"),
                new RemoveFirstNameDuplicates.Name("Chazz","Chappell")
        );

        test(expected, A);
    }

    private void test(List<String> expected, List<RemoveFirstNameDuplicates.Name> A) {
        RemoveFirstNameDuplicates.eliminateDuplicates(A);
        List<String> result = A.stream()
                                .map(name -> name.first)
                                .collect(Collectors.toList());
        AssertUtils.assertSameContentsString(expected, result);
    }

}