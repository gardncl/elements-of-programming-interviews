package primatives;

import datastructures.Rectangle;

public class RectangleIntersection {

    /*
    5.11

    Write a program which tests if two rectangles have a non-empty intersection.
    If the intersection is non empty, return the rectangle formed by their intersection.
     */

    public static Rectangle intersectRectangle(Rectangle r1, Rectangle r2) {
        if (isIntersect(r1,r2)) {
            return new Rectangle(
                    Math.max(r1.x,r2.x),
                    Math.max(r1.y,r2.y),
                    Math.min(r1.x + r1.width, r2.x + r2.width),
                    Math.min(r1.y + r1.height, r2.y + r2.height)
            );
        }
        return null;
    }

    private static boolean isIntersect(Rectangle r1, Rectangle r2) {
        return (r1.x <= r2.x + r2.width && r1.x + r1.width >= r2.x) ||
                (r1.x >= r2.x + r2.width && r1.x + r1.width <= r2.x) &&
                (r1.y <= r2.y + r2.height && r1.y + r1.height >= r2.y) ||
                (r1.y >= r2.y + r2.height && r1.y + r1.height <= r2.y);
    }

}
