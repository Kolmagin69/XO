package com.XO.model;

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


}