import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateRPNExpressionsTest {

    private Integer expected;
    private String expression;

    @Test
    public void eval1() {
        expected = 1729;
        expression = "1729";

        test(expected, expression);
    }

    @Test
    public void eval2() {
        expected = 15;
        expression = "3,4,+,2,x,1,+";

        test(expected, expression);
    }

    @Test
    public void eval3() {
        expected = -4;
        expression = "1,1,+,-2,x";

        test(expected, expression);
    }

    private void test(Integer expected, String expression) {
        assertEquals(expected, EvaluateRPNExpressions.eval(expression));
    }

}