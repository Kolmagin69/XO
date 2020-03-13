package com.XO;
import com.XO.controller.NameController;
import com.XO.model.*;
import com.XO.model.exceptions.IncorrectNameException;
import com.XO.view.Move;
import com.XO.view.Show;

import java.util.Scanner;

public class LetsPlayXO {
    public static void main(final String[] args) {
        final Player playerOne = NameController.playerInput(1,Figure.X);
        final Player playerTwo = NameController.playerInput(2,Figure.O);
        final Field field = new Field(3);
        final GameForTwo gameXO = GameForTwo.newBuider()
                .setName("XO")
                .setField(field)
                .setPlayerOne(playerOne)
                .setPlayerTwo(playerTwo)
                .build();

        Show.firstShowField(gameXO);

        while(Move.move(gameXO)) {
            Show.showField(gameXO);
        }
    }



}
