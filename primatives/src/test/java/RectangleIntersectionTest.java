import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleIntersectionTest {

    Rectangle expected;
    Rectangle r1;
    Rectangle r2;

    @Test
    public void intersectRectangle1() {
        expected = null;
        r1 = new Rectangle(0,0,1,1);
        r2 = new Rectangle(0,0,-1,-1);

        test(expected, r1, r2);
    }

    @Test
    public void intersectRectangle2() {
        expected = new Rectangle(2,2,4,4);
        r1 = new Rectangle(0,0,4,4);
        r2 = new Rectangle(2,2,4,4);

        test(expected, r1, r2);
    }

    @Test
    public void intersectRectangle3() {
        expected = new Rectangle(2,2,4,4);
        r1 = new Rectangle(0,0,4,4);
        r2 = new Rectangle(2,2,6,6);

        test(expected, r1, r2);
    }

    private void test(Rectangle expected, Rectangle r1, Rectangle r2) {
        assertEquals(expected, RectangleIntersection.intersectRectangle(r1, r2));
    }

}