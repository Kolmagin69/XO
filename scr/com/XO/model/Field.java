package com.XO.model;


import com.XO.model.exceptions.*;

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

    public void setFigures(final Point point, final Figure figure)
            throws IncorrectCoordinatException, IncorrectFigureException {
        if(getFigure(point) != null)
            throw new IncorrectCoordinatException
                    ("\n\"The field is not free!\"\n\"Try another point.\"");
        if(figure == null)
            throw new IncorrectFigureException
                    ("\n\"You can\'t put \"null\" in to the field!\"\n\"Try \"Figure.X\" or \"Figure.O\"\"");
        figures[point.getX()][point.getY()] = figure;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];

    }

    public Figure[][] getFigures() {
        return figures;
    }




}
