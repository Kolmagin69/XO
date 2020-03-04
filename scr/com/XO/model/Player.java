package com.XO.model;

import com.XO.model.exceptions.IncorrectFigureException;

public class Player {
    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) throws IncorrectFigureException {
        if(figure == null) {
            throw new IncorrectFigureException
                    ("\n\"You can\'t put \"null\" in to the field!\"\n\"Try \"Figure.X\" or \"Figure.O\"\"");
        }
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
