import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ComputeSalaryThresholdTest {

    private final double EPSILON = .1;
    private double expected;
    private double targetPayroll;
    private List<Double> currentSalaries;

    @Test
    public void findSalaryCap1() throws Exception {
        expected = 60;
        targetPayroll = 210;
        currentSalaries = Arrays.asList(
                90.,
                30.,
                100.,
                40.,
                20.
        );

        test(expected, targetPayroll, currentSalaries);
    }

    @Test
    public void findSalaryCap2() throws Exception {
        expected = 90;
        targetPayroll = 370;
        currentSalaries = Arrays.asList(
                50.,
                80.,
                60.,
                140.,
                100.
        );

        test(expected, targetPayroll, currentSalaries);
    }

    private void test(double expected, double targetPayroll, List<Double> currentSalaries) {
        assertEquals(expected, ComputeSalaryThreshold.findSalaryCap(targetPayroll, currentSalaries), EPSILON);
    }

}