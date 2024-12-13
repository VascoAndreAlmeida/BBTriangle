package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest  {

    /**
     * Test if triangle have 3 equals sides correctly = equilateral
     */
    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(100, 100, 100);
        assertEquals("equilateral", triangle.classify());

    }

    /**
     * Test if triangle have 2 equals sides correctly = isosceles
     */
    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(1, 1, 2);
        assertEquals("isosceles", triangle.classify());
    }

    /**
     * Test if triangle have 3 different sides correctly = scalene
     */
    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(98, 99, 100);
        assertEquals("scalene", triangle.classify());

    }

    /**
     * Test if triangle is right-angled(90º)
     */
    @Test
    public void testRightAngledTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("rightAngled", triangle.classify());
    }

    /**
     * Test if triangle is impossible
     */
    @Test
    public void testImpossibleTriangle() {
        Triangle triangle = new Triangle(-1, 1, 2);
        assertEquals("impossible", triangle.classify());

    }

    @Test
    public void testImpossibleTriangle2() {
        Triangle triangle = new Triangle(0, 1, 2);
        assertEquals("impossible", triangle.classify());
    }
    /**
     * Test area of triangle
     */
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(100, 100, 100);
        assertEquals(4330.127, triangle.getArea(), 0.001);

        Triangle impossibleTriangle = new Triangle(-1, 1, 3);
        assertEquals(-1.0, impossibleTriangle.getArea());
    }

    /**
     * Test Perimeter of triangle
     */
    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(100, 100, 100);
        assertEquals(300, triangle.getPerimeter());
    }
}
