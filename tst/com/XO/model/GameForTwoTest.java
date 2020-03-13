package com.XO.model;

import com.XO.model.exceptions.IncorrectNameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameForTwoTest {
    private final Field expectedField = new Field(3);
    private final Player expectedPlayerX = new Player("Nikita", Figure.X);
    private final Player expectedPlayerO = new Player("Kristina", Figure.O);
    private final String expectedName = "XO";
    private final GameForTwo expectedGame = GameForTwo
                .newBuider()
                .setPlayerOne(expectedPlayerX)
                .setPlayerTwo(expectedPlayerO)
                .setField(expectedField)
                .setName(expectedName)
                .build();

    @Test
    void testGetPlayerOne() {
        final Player actualPlayerX = expectedGame.getPlayerOne();
        assertEquals(expectedPlayerX, actualPlayerX);
    }

    @Test
    void testGetPlayerTwo() {
        final Player actualPlayerO = expectedGame.getPlayerTwo();
        assertEquals(expectedPlayerO, actualPlayerO);
    }

    @Test
    void testGetField() {
        final Field actualField = expectedGame.getField();
        assertEquals(expectedField, actualField);
    }

    @Test
    void testGetName() {
        final String actualName = expectedGame.getName();
        assertEquals(expectedName, actualName);
    }


    @Test
    void getNameFromFigure() {
        final String actualName = expectedGame.getNameFromFigure(Figure.X);
        assertEquals("Nikita", actualName);
        final  String actualName1 = expectedGame.getNameFromFigure(Figure.O);
        assertEquals("Kristina", actualName1);

    }

    @Test
    void testFailWhenTrySetPlayerWithSameFigure() {
       final Player expectedPlayerX1 = new Player("Nikita", Figure.X);
       final Player expectedPlayerO1 = new Player("Kristina", Figure.X);
       try {
            final GameForTwo expectedGame1 = GameForTwo
                   .newBuider()
                    .setPlayerTwo(expectedPlayerO1)
                    .setPlayerOne(expectedPlayerX1)
                    .build();
            fail();
       } catch (IncorrectNameException e) {}

        final Player expectedPlayerX2 = new Player("Nikita", Figure.O);
        final Player expectedPlayerO2 = new Player("Kristina", Figure.O);
        try {
            final GameForTwo expectedGame1 = GameForTwo
                    .newBuider()

                    .setPlayerOne(expectedPlayerX2)
                    .setPlayerTwo(expectedPlayerO2)
                    .build();
            fail();
        } catch (IncorrectNameException e) {}

    }
}