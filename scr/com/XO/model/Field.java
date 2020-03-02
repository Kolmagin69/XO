package com.XO.model;


import com.XO.model.exceptions.IncorrectCoordinatException;

public class Field {
    private final int size;
    private final Figure[][] figures;
    private Point point;


    public Field(int size) {
        this.size = size;
        figures = new Figure[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setFigures(final Point point, final Figure figure) throws IncorrectCoordinatException {
        if(getFigure(point) != null) throw new IncorrectCoordinatException("The field is not free, try another point");
        figures[(int) point.getX()][(int) point.getY()] = figure;
    }

    public Figure getFigure(final  Point point) {
        return figures[(int) point.getX()][(int) point.getY()];

    }

    public Figure[][] getFigures() {
        return figures;
    }




}
