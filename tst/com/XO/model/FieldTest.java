package com.XO.model;

import com.XO.controller.MoveController;
import com.XO.model.exceptions.IncorrectCoordinatException;
import com.XO.model.exceptions.IncorrectFigureException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void testGetSize() {
        final int inputSize = 3;
        final int expectedSize = inputSize;
        final Field field = new Field(inputSize);
        final int actualSize = field.getSize();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void testSetFigure() {
        final Field field = new Field(3);

        final Point inputPoint = Point.X0_Y0;
        final Point expectedPoint = inputPoint;

        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;

        field.setFigures(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(expectedPoint);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    void testFailSetFigure_IfNullFigure() {
        final Field field = new Field(3);

        try {
            field.setFigures(Point.X0_Y0, null);
            fail();
        } catch (IncorrectFigureException e) {

        }

    }



    @Test
    void getFigure() {
        final Field field = new Field(3);

        final Point inputPoint = Point.X0_Y0;
        final Point expectedPoint = inputPoint;

        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;

        field.setFigures(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(expectedPoint);

        assertEquals(expectedFigure, actualFigure);

        final Figure actualFigure1 = field.getFigure(Point.X0_Y1);

        assertEquals(null, actualFigure1);


    }

    @Test
    void getFigures() {
        final int valueSize = 3;
        final Field field = new Field(valueSize);
        final Figure[][] expectedFigures = new Figure[valueSize][valueSize];
        final int expectedLengthFigures = expectedFigures.length;
        final int actualLengthFigures = field.getFigures().length;
        assertEquals(expectedLengthFigures, actualLengthFigures);

       expectedFigures[1][1] = Figure.X;
       field.setFigures(Point.X1_Y1, Figure.X);
       final Figure[][] actualFigures = field.getFigures();
       assertEquals(expectedFigures[1][1], actualFigures[1][1]);
    }

    @Test
    void testGetCounterFigure() {
        final Field field = new Field(3);
        field.setFigures(Point.X0_Y0, MoveController.currentFigure(field));
        final int actualNumberOfFigure1 = field.getCounterFigure();

        assertEquals(1, actualNumberOfFigure1);

        field.setFigures(Point.X1_Y0, MoveController.currentFigure(field));
        field.setFigures(Point.X2_Y0, MoveController.currentFigure(field));
        final int actualNumberOfFigure2 = field.getCounterFigure();

        assertEquals(3, actualNumberOfFigure2);

        field.setFigures(Point.X0_Y1, MoveController.currentFigure(field));
        field.setFigures(Point.X0_Y2, MoveController.currentFigure(field));
        field.setFigures(Point.X1_Y1, MoveController.currentFigure(field));
        field.setFigures(Point.X1_Y2, MoveController.currentFigure(field));
        field.setFigures(Point.X2_Y1, MoveController.currentFigure(field));
        field.setFigures(Point.X2_Y2, MoveController.currentFigure(field));
        final int actualNumberOfFigure3 = field.getCounterFigure();

        assertEquals(9, actualNumberOfFigure3);



    }
}