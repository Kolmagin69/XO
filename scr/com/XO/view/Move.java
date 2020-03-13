package com.XO.view;

import com.XO.controller.MoveController;
import com.XO.controller.PrematureEndingController;
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
            System.out.format("Winner is: \'%s\'\n", game.getNameFromFigure(winner));
            return false;
        }
        if (PrematureEndingController.fieldIsFull(field)) {
            System.out.println("No winner and no moves left!");
            return false;
        }
        final Figure currentFigure = MoveController.currentFigure(field);
        System.out.format("\'%s\'please enter move point for: %s\n", game.getNameFromFigure(currentFigure), currentFigure);
        Move move = new Move();

        MoveController.applyFigure(field, move.checkedPointOnField(field), currentFigure);

        return true;
    }

    private  Point askPoint(final Field field) {
        return Point.getPoint(checkedPointCoordinate(field,"X"), checkedPointCoordinate(field,"Y"));
    }
    private int checkedPointCoordinate(final Field field, final String cordinate) {
        int pointNum = consoleCoordinateScanner.nextCoordinate(cordinate);
        while (pointNum < 0 || pointNum >= field.getSize()) {
            System.out.format("!!!Try a value from 0 to %d\n", field.getSize() - 1);
            pointNum = consoleCoordinateScanner.nextCoordinate(cordinate);

        }
        return pointNum;
    }
    private Point checkedPointOnField(final Field field) {
        Move move = new Move();
        Point localPoint = move.askPoint(field);
        while (field.getFigure(localPoint) != null) {
            System.out.println("!!!Field is't free.Try another point.");
            localPoint = move.askPoint(field);

        }
        return localPoint;
    }
}
