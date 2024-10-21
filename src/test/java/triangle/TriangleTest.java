package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest  {

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertEquals("equilateral", triangle.classify());
        assertTrue(triangle.isEquilateral());
        assertTrue(triangle.isIsosceles());
        assertFalse(triangle.isScalene());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 3);
        assertEquals("isossceles", triangle.classify());
        assertTrue(triangle.isIsosceles());
        assertFalse(triangle.isEquilateral());
        assertFalse(triangle.isScalene());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("scalene", triangle.classify());
        assertFalse(triangle.isEquilateral());
        assertFalse(triangle.isIsosceles());
        assertTrue(triangle.isScalene());
    }

    @Test
    public void testRightAngledTriangle() {
        Triangle triangle = new Triangle(5, 3, 4);
        assertTrue(triangle.isRightAngled());
    }

    @Test
    public void testImpossibleTriangle() {
        Triangle triangle = new Triangle(-1, 1, 3);
        assertEquals("impossible", triangle.classify());
        assertTrue(triangle.isImpossible());
    }

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.001);

        Triangle impossibleTriangle = new Triangle(-1, 1, 3);
        assertEquals(-1.0, impossibleTriangle.getArea());
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter());
    }
}