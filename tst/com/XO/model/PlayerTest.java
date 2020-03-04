package com.XO.model;

import com.XO.model.exceptions.IncorrectFigureException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        final String inputValue = "Black Man";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, Figure.X);
        final String actualValue = player.getName();
        assertEquals(expectedValue, actualValue);

    }

    @Test
    void getFigure() {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player("Name", inputValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);

    }
}