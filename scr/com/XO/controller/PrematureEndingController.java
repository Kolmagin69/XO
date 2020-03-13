package com.XO.controller;

import com.XO.model.Field;
import com.XO.model.Figure;
import com.XO.model.Game;
import com.XO.model.GameForTwo;
import com.XO.model.Point;

public class PrematureEndingController {


    public static boolean noMoveToWin(final GameForTwo game) {

        if (ItsFigureCanWin(Figure.X, game) || ItsFigureCanWin(Figure.O, game)) return false;
        return true;
    }
    private static boolean ItsFigureCanWin(final Figure figure, final GameForTwo game) {
        final Field field = game.getField();
        if (!fieldIsFull(field)) {
            setFigureOnFreePoint(figure, game);
        }
        if (WinnerController.getWinner(field) != null) return true;
        return  false;
    }

    public static boolean fieldIsFull(final Field field) {
        if (field.getCounterFigure() == field.getSize() * field.getSize()) return true;
        return false;
    }
    private static void setFigureOnFreePoint(Figure figure, final GameForTwo game) {
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
