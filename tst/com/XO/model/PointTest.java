package com.XO.model;

import com.XO.model.exceptions.IncorrectCoordinatException;
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

    @Test
    void testGetPoint() {
        final Point actual00 = Point.getPoint(0,0);
        final Point actual01 = Point.getPoint(0,1);
        final Point actual02 = Point.getPoint(0,2);
        final Point actual10 = Point.getPoint(1,0);
        final Point actual11 = Point.getPoint(1,1);
        final Point actual12 = Point.getPoint(1,2);
        final Point actual20 = Point.getPoint(2,0);
        final Point actual21 = Point.getPoint(2,1);
        final Point actual22 = Point.getPoint(2,2);

        assertEquals(Point.X0_Y0, actual00);
        assertEquals(Point.X0_Y1, actual01);
        assertEquals(Point.X0_Y2, actual02);
        assertEquals(Point.X1_Y0, actual10);
        assertEquals(Point.X1_Y1, actual11);
        assertEquals(Point.X1_Y2, actual12);
        assertEquals(Point.X2_Y0, actual20);
        assertEquals(Point.X2_Y1, actual21);
        assertEquals(Point.X2_Y2, actual22);
    }

    @Test
    void testFailIfXIsLessThan0() {
        try {
            Point.getPoint(-6, 2);
            fail();
        } catch (IncorrectCoordinatException e) {}
    }
    @Test
    void testFailIfYIsLessThan0() {
        try {
            Point.getPoint(1, -9);
            fail();
        } catch (IncorrectCoordinatException e) {}
    }
     @Test
    void testFailIfXIsGreaterThan3() {
        try {
            Point.getPoint(6, 2);
            fail();
        } catch (IncorrectCoordinatException e) {}
    }
     @Test
    void testFailIfYIsGreaterThan3() {
        try {
            Point.getPoint(0, 9);
            fail();
        } catch (IncorrectCoordinatException e) {}
    }
    @Test
    void testFailIfYIsGreaterThan4() {
        try {
            Point.getPoint(2, 3);
            fail();
        } catch (IncorrectCoordinatException e) {}
    }

}