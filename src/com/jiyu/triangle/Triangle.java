package com.jiyu.triangle;

/**
 * Given the side lengths a, b and c, determine the type of triangle, or whether the input is invalid
 */
public final class Triangle {
    public enum Type {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
        INVALID
    }

    /**
     * Make constructor private to avoid instantiation
     */
    private Triangle() {}

    /**
     *
     * @param a length of side a
     * @param b length of side b
     * @param c length of side c
     * @return type of the triangle or invalid if it's not a triangle at all
     */
    public static Type getTriangleType(int a, int b, int c) {
        // Input should be positive and meet triangle inequality
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
            return Type.INVALID;
        if (a == b && b == c)
            return Type.EQUILATERAL;
        else if (a == b || b == c || c == a)
            return Type.ISOSCELES;
        else
            return Type.SCALENE;
    }
}
