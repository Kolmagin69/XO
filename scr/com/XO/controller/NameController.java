package com.XO.controller;

import com.XO.model.Figure;
import com.XO.model.Player;
import com.XO.model.exceptions.IncorrectNameException;

import java.util.Scanner;

public class NameController {
    public  static String playerNameInput(final int count) throws IncorrectNameException {
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter Player %s  name: ", count);
        String name = sc.nextLine();
        return name;
    }
    public static Player playerInput(final int count, final Figure figure)  {
        Player player;
        try {
            player = new Player(playerNameInput(count), figure);
        } catch (IncorrectNameException e) {
            System.out.println("Incorrect player name. Wrong player name options:\n" +
                    "1 - \"\"\n" +
                    "2 - \"  \"\n" +
                    " The name must contain at least one character! Example of the correct name:\n" +
                    "1 - \"Nikita\"\n" +
                    "2 - \" nIKiTA\"\n" +
                    "3 - \"N\"");
            player = new Player(playerNameInput(count), figure);
        }
        return player;
    }
}
