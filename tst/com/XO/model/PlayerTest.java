package com.XO.model;

import com.XO.model.exceptions.IncorrectFigureException;
import com.XO.model.exceptions.IncorrectNameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testGetName() {
        final String inputValue = "  Black Man";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, Figure.X);
        final String actualValue = player.getName();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    void testGetFigure() {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player("name", inputValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    void testFailIfNullFigure() {
        try {
            final Player valuePlayer = new Player("Misha", null);
            fail();
        } catch (IncorrectFigureException e) {}
    }
    @Test
    void testFailIfNullName() {
        try {
            final Player valuePlayer = new Player(null, Figure.X);
            fail();
        } catch (IncorrectNameException e) {}
    }
    @Test
    void testFailIfEmptyName() {
        try {
            final Player valuePlayer = new Player("", Figure.X);
            fail();
        } catch (IncorrectNameException e) {}
    }
    @Test
    void testFailIfNoCharactersName() {
        try {
            final Player valuePlayer = new Player(null, Figure.X);
            fail();
        } catch (IncorrectNameException e) {}
    }

    @Test
    void testCheckName() {
        final String inputValue = "Black Man";

        final Player valuePlayer= new Player(inputValue, Figure.X);

        assertTrue(valuePlayer.checkName(inputValue));
        assertFalse(valuePlayer.checkName(null));
        assertFalse(valuePlayer.checkName(""));
        assertFalse(valuePlayer.checkName("    "));
    }
}