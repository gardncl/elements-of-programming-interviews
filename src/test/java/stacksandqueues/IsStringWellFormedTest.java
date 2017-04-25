package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static stacksandqueues.IsStringWellFormed.isWellFormed;

public class IsStringWellFormedTest {

    private boolean expected;
    private String expression;

    @Test
    public void isWellFormed1() {
        expected = true;
        expression = "[]";

        test(expected, expression);
    }

    @Test
    public void isWellFormed2() {
        expected = true;
        expression = "([]){()}";

        test(expected, expression);
    }

    @Test
    public void isWellFormed3() {
        expected = true;
        expression = "[()[]{()()}]";

        test(expected, expression);
    }

    @Test
    public void isWellFormed4() {
        expected = false;
        expression = "{)";

        test(expected, expression);
    }

    @Test
    public void isWellFormed5() {
        expected = false;
        expression = "[()[]{()()";

        test(expected, expression);
    }

    private void test(boolean expected, String expression) {
        assertEquals(expected, isWellFormed(expression));
    }

}