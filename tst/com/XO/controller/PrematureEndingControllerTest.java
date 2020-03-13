package com.XO.controller;

import com.XO.model.*;
import com.XO.view.Show;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrematureEndingControllerTest {

    @Test
    void testNoMoveToWin() {
        final Player playerOne = new Player("Nik", Figure.X);
        final Player playerTwo = new Player("Kri", Figure.O);
        final Field field = new Field(3);
        final GameForTwo gameXO = GameForTwo.newBuider()
                .setName("XO")
                .setField(field)
                .setPlayerOne(playerOne)
                .setPlayerTwo(playerTwo)
                .build();
        Show.showField(gameXO);
        if(!PrematureEndingController.noMoveToWin(gameXO)) {
            Show.showField(gameXO);
        }
        }
    }
