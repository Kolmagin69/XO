package com.XO.controller;

import com.XO.model.Field;
import com.XO.model.GameForTwo;

public class PrematureEndingController {
    public static boolean noMoveToWin(GameForTwo game) {
        Field field = game.getField();
        final int size = field.getSize();
        if (field.getCounterFigure() != size * size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (field.getFigure())
                }
            }
        }
    }
    public static boolean fieldIsFull(final Field field) {
        if (field.getCounterFigure() == field.getSize() * field.getSize()) return true;
        return false;
    }
}
