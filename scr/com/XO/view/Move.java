package com.XO.view;

import com.XO.controller.MoveController;
import com.XO.controller.WinnerController;
import com.XO.model.*;
import com.XO.model.exceptions.IncorrectCoordinatException;
import com.XO.view.scanner.ConsoleCoordinateScanner;
import com.XO.view.scanner.CoordinateScanner;


public class Move {
    final CoordinateScanner consoleCoordinateScanner = new ConsoleCoordinateScanner();
    public static boolean move(final GameForTwo game) {
        final Field field = game.getField();
        final Figure winner = WinnerController.getWinner(field);
        if (winner != null) {
            System.out.format("Winner is: %s\n", winner);
            return false;
        }
        if (WinnerController.fieldIsFull(field)) {
            System.out.println("No winner and no moves left!");
            return false;
        }
        final Figure currentFigure = MoveController.currentFigure(field);
        System.out.format("Please enter move point for: %s\n", currentFigure);
        Move move = new Move();
        final Point point = move.askPoint();
        try {
            MoveController.applyFigure(field, point, currentFigure);
        } catch (final IncorrectCoordinatException e) {
            System.out.println("Point is invalid!");
        }
        return true;
    }

    private  Point askPoint() {
        return Point.getPoint(consoleCoordinateScanner.nextCoordinate("X") , consoleCoordinateScanner.nextCoordinate("Y") );
    }
}
