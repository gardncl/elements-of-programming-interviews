package primatives;

import datastructures.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static primatives.RectangleIntersection.intersectRectangle;

class RectangleIntersectionTest {

    Rectangle expected;
    Rectangle r1;
    Rectangle r2;

    @Test
    void intersectRectangle1() {
        expected = new Rectangle(0,0,0,0);
        r1 = new Rectangle(0,0,1,1);
        r2 = new Rectangle(0,0,-1,-1);

        test(expected, r1, r2);
    }

    @Test
    void intersectRectangle2() {
        expected = new Rectangle(2,2,4,4);
        r1 = new Rectangle(0,0,4,4);
        r2 = new Rectangle(2,2,4,4);

        test(expected, r1, r2);
    }

    @Test
    void intersectRectangle3() {
        expected = new Rectangle(2,2,4,4);
        r1 = new Rectangle(0,0,4,4);
        r2 = new Rectangle(2,2,6,6);

        test(expected, r1, r2);
    }

    private void test(Rectangle expected, Rectangle r1, Rectangle r2) {
        assertEquals(expected, intersectRectangle(r1, r2));
    }

}