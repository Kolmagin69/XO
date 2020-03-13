package com.XO.controller;

import com.XO.model.Field;
import com.XO.model.Figure;
import com.XO.model.Point;

public class WinnerController {
    public static Figure getWinner(final Field field){
        if (checkLineWinner(field) != null) return checkLineWinner(field);
        return  null;
    }
    public static Figure checkLineWinner(final Field field) {
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < field.getSize(); i++) {
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
            for (int j = 0; j < field.getSize(); j++) {
                if (field.getFigure(Point.getPoint(j,i)) == Figure.X) counterX ++;
                if (field.getFigure(Point.getPoint(j,i)) == Figure.O) counterO ++;
                if (counterX == field.getSize()) return  Figure.X;
                if (counterO == field.getSize()) return Figure.O;
            }
            counterO = 0;
            counterX = 0;
        }
        for (int i = 0; i < field.getSize(); i++) {
            if (field.getFigure(Point.getPoint(i,i)) == Figure.X) counterX++;
            if (field.getFigure(Point.getPoint(i,i)) == Figure.O) counterO++;
            if (counterX == field.getSize()) return  Figure.X;
            if (counterO == field.getSize()) return Figure.O;
        }
        counterO = 0;
        counterX = 0;
        int pointX = field.getSize();
        for (int i = 0; i < field.getSize(); i++) {
            pointX--;
            if (field.getFigure(Point.getPoint(pointX,i)) == Figure.X) counterX++;
            if (field.getFigure(Point.getPoint(pointX,i)) == Figure.O) counterO++;
            if (counterX == field.getSize()) return  Figure.X;
            if (counterO == field.getSize()) return Figure.O;
        }
        counterO = 0;
        counterX = 0;
        return  null;
    }
    public static boolean fieldIsFull(final Field field) {
        if (field.getCounterFigure() == field.getSize() * field.getSize()) return true;
        return false;
    }


}
