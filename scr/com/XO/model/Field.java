package com.XO.model;
import java.awt.Point;

public class Field {
    private int size;
    private Figure[][] figures;
    private Point point;


    public Field(int size) {
        this.size = size;
        figures = new Figure[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setFigures(final Point point, final Figure figure) {
        figures[(int) point.getX()][(int) point.getY()] = figure;
    }

    public Figure getFigure(final  Point point) {
        return figures[(int) point.getX()][(int) point.getY()];

    }

    public Figure[][] getFigures() {
        return figures;
    }


}
