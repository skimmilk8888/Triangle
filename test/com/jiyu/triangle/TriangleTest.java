package com.jiyu.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Triangle class JUnit tests
 */
public class TriangleTest {
    /**
     * Tests one of the input is negative
     */
    @Test
    public void testNegativeNumber() {
        assertEquals(Triangle.Type.INVALID, Triangle.getTriangleType(-3, 2, 4));
    }

    /**
     * Tests one of the input is zero
     */
    @Test
    public void testZeroNumber() {
        assertEquals(Triangle.Type.INVALID, Triangle.getTriangleType(0, 2, 4));
    }

    /**
     * Tests the length of 3 sides don't meet the triangle inequality
     */
    @Test
    public void testInvalidTriangle() {
        assertEquals(Triangle.Type.INVALID, Triangle.getTriangleType(3, 2, 5));
        assertEquals(Triangle.Type.INVALID, Triangle.getTriangleType(3, 2, 50));
    }

    /**
     * Tests equilateral triangle
     */
    @Test
    public void testEquilateral() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.getTriangleType(5, 5, 5));
    }

    /**
     * Tests isosceles triangle
     */
    @Test
    public void testIsosceles() {
        assertEquals(Triangle.Type.ISOSCELES, Triangle.getTriangleType(6, 5, 5));
        assertEquals(Triangle.Type.ISOSCELES, Triangle.getTriangleType(5, 6, 5));
        assertEquals(Triangle.Type.ISOSCELES, Triangle.getTriangleType(5, 5, 6));
    }

    /**
     * Tests scalene triangle
     */
    @Test
    public void testScalene() {
        assertEquals(Triangle.Type.SCALENE, Triangle.getTriangleType(6, 5, 3));
    }
}