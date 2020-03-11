package com.XO.controller;

import com.XO.model.*;
import com.XO.model.exceptions.IncorrectCoordinatException;
import com.XO.view.Show;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveControllerTest {

    @Test
    void teatApplyFigure() {
        final Field inputField = new Field(3);
        final Field expectedField = inputField;
        final Point inputPoint = Point.X1_Y1;
        final Point expectedPoint = inputPoint;
        final Figure inputFigure = Figure.X;
        final Figure expectedFigure = inputFigure;

        MoveController.applyFigure(inputField, inputPoint, inputFigure);
        final Figure actualFigure = expectedField.getFigure(expectedPoint);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    void testFailIfFieldIsBusy() {
        final Field inputField = new Field(3);
        try {
            MoveController.applyFigure(inputField, Point.X1_Y1, Figure.X);
            MoveController.applyFigure(inputField, Point.X1_Y1, Figure.O);
            fail();
        } catch (IncorrectCoordinatException e) {}

    }

    @Test
    void testCurrentFigure() {
        final Field inputField = new Field(3);
        final Figure actualFigure1 = MoveController.currentFigure(inputField);

        assertEquals(Figure.X, actualFigure1);

        MoveController.applyFigure(inputField, Point.X1_Y1, actualFigure1);
        final Figure actualFigure2 = MoveController.currentFigure(inputField);

        assertEquals(Figure.O, actualFigure2);

        MoveController.applyFigure(inputField, Point.X2_Y1, actualFigure2);
        final Figure actualFigure3 = MoveController.currentFigure(inputField);

        assertEquals(Figure.X, actualFigure3);
        
        MoveController.applyFigure(inputField, Point.X2_Y2, actualFigure3);
        MoveController.applyFigure(inputField, Point.X1_Y2, MoveController.currentFigure(inputField));
        final Figure actualFigure4 = MoveController.currentFigure(inputField);

        assertEquals(Figure.X, actualFigure4);   
    }
}