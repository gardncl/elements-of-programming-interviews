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
        expected = null;
        r1 = null;
        r2 = null;

        test(expected, r1, r2);
    }

    private void test(Rectangle expected, Rectangle r1, Rectangle r2) {
        assertEquals(expected, intersectRectangle(r1, r2));
    }

}