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
        assertTrue(triangle.isEquilateral());
        assertTrue(triangle.isIsosceles());
        assertFalse(triangle.isScalene());
    }

    /**
     * Test if triangle have 2 equals sides correctly = isosceles
     */
    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(1, 1, 2);
        assertEquals("isosceles", triangle.classify());
        assertTrue(triangle.isIsosceles());
        assertFalse(triangle.isEquilateral());
        assertFalse(triangle.isScalene());
    }

    /**
     * Test if triangle have 3 different sides correctly = scalene
     */
    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(98, 99, 100);
        assertEquals("scalene", triangle.classify());
        assertFalse(triangle.isEquilateral());
        assertFalse(triangle.isIsosceles());
        assertTrue(triangle.isScalene());
    }

    /**
     * Test if triangle is right-angled(90º)
     */
    @Test
    public void testRightAngledTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isRightAngled());
    }

    /**
     * Test if triangle is impossible
     */
    @Test
    public void testImpossibleTriangle() {
        Triangle triangle = new Triangle(-1, 1, 2);
        assertEquals("impossible", triangle.classify());
        assertTrue(triangle.isImpossible());
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