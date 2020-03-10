package com.XO.controller;

import com.XO.model.*;
import com.XO.model.exceptions.IncorrectCoordinatException;

public class MoveController {

    public void applyFigure(final Field field, final Point point, final Figure figure)
                            throws IncorrectCoordinatException {

        if(field.getFigure(point) != null)
            throw new IncorrectCoordinatException
                    ("\n\"The field is not free!\"\n\"Try another point.\"");

        field.setFigures(point, figure);
    }



    public Figure currentFigure(final Field field) {
        int counter = 0;

        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                if(field.getFigure(Point.getPoint(i, j)) != null) counter++;
            }
        }

        if(counter % 2 == 1) return Figure.O;
        return Figure.X;
    }



}
