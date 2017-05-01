import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class PartitionSortRepeatsTest {

    private Map<Integer, AtomicInteger> expected;
    private List<PartitionSortRepeats.Person> people;

    @Test
    public void groupByAge() throws Exception {
        expected = new HashMap<>();
        expected.put(23, new AtomicInteger(2));
        expected.put(25, new AtomicInteger(3));
        expected.put(26, new AtomicInteger(2));
        people = Arrays.asList(
                new PartitionSortRepeats.Person(25, "Rita"),
                new PartitionSortRepeats.Person(23, "Felipe"),
                new PartitionSortRepeats.Person(25, "Vera"),
                new PartitionSortRepeats.Person(25, "Nathan"),
                new PartitionSortRepeats.Person(26, "Daniel"),
                new PartitionSortRepeats.Person(23, "Zach"),
                new PartitionSortRepeats.Person(26, "Tom")
        );

        test(expected, people);
    }

    private void test(Map<Integer, AtomicInteger> map, List<PartitionSortRepeats.Person> people) {
        PartitionSortRepeats.groupByAge(people);
        int current = -1;
        try {
            for (PartitionSortRepeats.Person person : people ) {
                if (current != person.age && map.get(person.age) != null) {
                    if (0 == map.get(person.age).decrementAndGet())
                        map.remove(person.age);
                    current = person.age;
                } else if (map.get(person.age) != null) {
                    map.get(person.age).getAndDecrement();
                } else {
                    throw new AssertionError(person.age);
                }
            }
        } catch (AssertionError e) {
            fail("Age "+e.getMessage()+" was not present");
        }

    }

}