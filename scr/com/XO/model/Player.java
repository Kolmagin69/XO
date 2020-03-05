package com.XO.model;

import com.XO.model.exceptions.*;

public class Player {
    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) throws IncorrectFigureException, IncorrectNameException {
        if(figure == null) {
            throw new IncorrectFigureException
                    ("\nYou can\'t put \"null\" in to the field!\nTry \"Figure.X\" or \"Figure.O\"");
        }
        if(!checkName(name)) {
            throw  new IncorrectNameException
                    ("\nIncorrect player name. Wrong player name options:\n1 - \"\"\n2 - \"  \"\n3 - null\n" +
                            "The name must contain at least one character! Example of the correct name:\n1 - \"Nikita\"\n2 - \" nIKiTA\"\n3 - \"N\"");
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
    public boolean checkName(String name) {
        if(name == null || name.isEmpty() || name.trim().isEmpty()) return false;
        return true;
    }

}
