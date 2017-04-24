package stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static stacksandqueues.IsStringWellFormed.isWellFormed;

class IsStringWellFormedTest {

    private boolean expected;
    private String expression;

    @Test
    void isWellFormed1() {
        expected = true;
        expression = "[]";

        test(expected, expression);
    }

    @Test
    void isWellFormed2() {
        expected = true;
        expression = "([]){()}";

        test(expected, expression);
    }

    @Test
    void isWellFormed3() {
        expected = true;
        expression = "[()[]{()()}]";

        test(expected, expression);
    }

    @Test
    void isWellFormed4() {
        expected = false;
        expression = "{)";

        test(expected, expression);
    }

    @Test
    void isWellFormed5() {
        expected = false;
        expression = "[()[]{()()";

        test(expected, expression);
    }

    private void test(boolean expected, String expression) {
        assertEquals(expected, isWellFormed(expression));
    }

}