package stacksandqueues;

import datastructures.BuildingWithHeight;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static stacksandqueues.ComputeBuildingsWithView.examineBuildingsWithSunset;

class ComputeBuildingsWithViewTest {

    private Deque<BuildingWithHeight> expected;
    private LinkedList<Integer> sequence;

    @Test
    void examineBuildingsWithSunset1() {
        expected = new LinkedList<>(Arrays.asList(
                new BuildingWithHeight(4,5))
        );
        sequence = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        test(expected, sequence);
    }

    @Test
    void examineBuildingsWithSunset2() {
        expected = new LinkedList<>(Arrays.asList(
                new BuildingWithHeight(0,5),
                new BuildingWithHeight(1,4),
                new BuildingWithHeight(2,3),
                new BuildingWithHeight(3,2),
                new BuildingWithHeight(4,1))
        );
        sequence = new LinkedList<>(Arrays.asList(5,4,3,2,1));

        test(expected, sequence);
    }

    @Test
    void examineBuildingsWithSunset3() {
        expected = new LinkedList<>(Arrays.asList(
                new BuildingWithHeight(0,5),
                new BuildingWithHeight(2,4),
                new BuildingWithHeight(4,2))
        );
        sequence = new LinkedList<>(Arrays.asList(5,3,4,1,2));

        test(expected, sequence);
    }

    private void test(Deque<BuildingWithHeight> expected, LinkedList<Integer> sequence) {
        assertEquals(expected, examineBuildingsWithSunset(sequence.iterator()));
    }
}