package com.XO.controller;

import com.XO.model.*;
import com.XO.model.exceptions.IncorrectCoordinatException;

public class MoveController {

    public static void applyFigure(final Field field, final Point point, final Figure figure)
                            throws IncorrectCoordinatException {

        if(field.getFigure(point) != null)
            throw new IncorrectCoordinatException
                    ("\n\"The field is not free!\"\n\"Try another point.\"");

        field.setFigures(point, figure);
    }



    public static Figure currentFigure(final Field field) {
        if(field.getCounterFigure() % 2 == 1) return Figure.O;
        return Figure.X;
    }



}
