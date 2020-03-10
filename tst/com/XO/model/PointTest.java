package com.XO.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private static final Point X0_Y0 = Point.X0_Y0;
    private static final Point X0_Y1 = Point.X0_Y1;
    private static final Point X0_Y2 = Point.X0_Y2;
    private static final Point X1_Y0 = Point.X1_Y0;
    private static final Point X1_Y1 = Point.X1_Y1;
    private static final Point X1_Y2 = Point.X1_Y2;
    private static final Point X2_Y0 = Point.X2_Y0;
    private static final Point X2_Y1 = Point.X2_Y1;
    private static final Point X2_Y2 = Point.X2_Y2;

    @Test
    void testGetX() {
        final int expectedX0 = 0;
        final int expectedX1 = 1;
        final int expectedX2 = 2;

        final int actual00 = X0_Y0.getX();
        final int actual01 = X0_Y1.getX();
        final int actual02 = X0_Y2.getX();
        final int actual10 = X1_Y0.getX();
        final int actual11 = X1_Y1.getX();
        final int actual12 = X1_Y2.getX();
        final int actual20 = X2_Y0.getX();
        final int actual21 = X2_Y1.getX();
        final int actual22 = X2_Y2.getX();

        assertEquals(expectedX0, actual00);
        assertEquals(expectedX0, actual01);
        assertEquals(expectedX0, actual02);
        assertEquals(expectedX1, actual10);
        assertEquals(expectedX1, actual11);
        assertEquals(expectedX1, actual12);
        assertEquals(expectedX2, actual20);
        assertEquals(expectedX2, actual21);
        assertEquals(expectedX2, actual22);

    }

    @Test
    void testGetY() {
        final int expectedY0 = 0;
        final int expectedY1 = 1;
        final int expectedY2 = 2;

        final int actual00 = X0_Y0.getY();
        final int actual01 = X0_Y1.getY();
        final int actual02 = X0_Y2.getY();
        final int actual10 = X1_Y0.getY();
        final int actual11 = X1_Y1.getY();
        final int actual12 = X1_Y2.getY();
        final int actual20 = X2_Y0.getY();
        final int actual21 = X2_Y1.getY();
        final int actual22 = X2_Y2.getY();

        assertEquals(expectedY0, actual00);
        assertEquals(expectedY1, actual01);
        assertEquals(expectedY2, actual02);
        assertEquals(expectedY0, actual10);
        assertEquals(expectedY1, actual11);
        assertEquals(expectedY2, actual12);
        assertEquals(expectedY0, actual20);
        assertEquals(expectedY1, actual21);
        assertEquals(expectedY2, actual22);


    }
}