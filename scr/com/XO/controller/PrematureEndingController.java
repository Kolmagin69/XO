package com.XO.controller;

import com.XO.model.Field;
import com.XO.model.Figure;
import com.XO.model.GameForTwo;
import com.XO.model.Point;

public class PrematureEndingController {


    public static boolean noMoveToWin(final GameForTwo game) {
        Field field1 = game.getField();
        final GameForTwo game2 = game;
        Field field2 = game2.getField();
        if (!fieldIsFull(field1)) {
            setFigureOnFreePoint(Figure.X, game);
        }
    }
    public static boolean fieldIsFull(final Field field) {
        if (field.getCounterFigure() == field.getSize() * field.getSize()) return true;
        return false;
    }
    private static void setFigureOnFreePoint(final Figure figure, final GameForTwo game) {
        Field field = game.getField();
        final int size = field.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Point point = Point.getPoint(i, j);
                if (field.getFigure(point) == null) field.setFigures(point, figure);
            }
        }

    }
}
