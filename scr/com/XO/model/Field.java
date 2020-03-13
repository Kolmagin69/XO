package com.XO.model;


import com.XO.model.exceptions.*;

public class Field {
    private final int size;
    private int counterFigure = 0;
    private final Figure[][] figures;



    public Field(int size) {
        this.size = size;
        figures = new Figure[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setFigures(final Point point, final Figure figure)
            throws IncorrectFigureException {

        if(figure == null)
            throw new IncorrectFigureException
                    ("\n\"You can\'t put \"null\" in to the field!\"\n\"Try \"Figure.X\" or \"Figure.O\"\"");
        figures[point.getX()][point.getY()] = figure;
        counterFigure++;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];

    }

    public Figure[][] getFigures() {
        return figures;
    }

    public int getCounterFigure(){
        return counterFigure;
    }




}
