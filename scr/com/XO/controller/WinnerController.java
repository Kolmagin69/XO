package com.XO.controller;

import com.XO.model.Field;
import com.XO.model.Figure;
import com.XO.model.Point;

public class WinnerController {
    public static Figure getWinner(final Field field){

        return  null;
    }
    public static Figure checkLineWinner(final Field field) {
        for (int i = 0; i < field.getSize(); i++) {
            int counterX = 0;
            int counterO = 0;
            for (int j = 0; j < field.getSize(); j++) {
                if (field.getFigure(Point.getPoint(i,j)) == Figure.X) counterX ++;
                if (field.getFigure(Point.getPoint(i,j)) == Figure.O) counterO ++;
                if (counterX == field.getSize()) return  Figure.X;
                if (counterO == field.getSize()) return Figure.O;
            }
            counterO = 0;
            counterX = 0;
        }
        for (int i = 0; i < field.getSize(); i++) {
            int counterX = 0;
            int counterO = 0;
            for (int j = 0; j < field.getSize(); j++) {
                if (field.getFigure(Point.getPoint(j,i)) == Figure.X) counterX ++;
                if (field.getFigure(Point.getPoint(j,i)) == Figure.O) counterO ++;
                if (counterX == field.getSize()) return  Figure.X;
                if (counterO == field.getSize()) return Figure.O;
            }
            counterO = 0;
            counterX = 0;
        }

        return  null;
    }
    public boolean fieldIsFull(final  Field field) {
        int counter = 0;
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                if (field.getFigure(Point.getPoint(i,j)) != null) counter++;
            }
        }
        if (counter == field.getSize() * field.getSize()) return true;
        return false;
    }
}
