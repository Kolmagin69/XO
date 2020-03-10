package com.XO.controller;

import com.XO.model.*;
import com.XO.model.exceptions.IncorrectCoordinatException;

public class MoveController {
    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws IncorrectCoordinatException {

        if(field.getFigure(point) != null)
            throw new IncorrectCoordinatException
                    ("\n\"The field is not free!\"\n\"Try another point.\"");

    }


}
