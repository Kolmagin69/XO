package com.XO.view.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleCoordinateScanner implements CoordinateScanner {
    @Override
    public int nextCoordinate(String coordinate) {
        System.out.format("Please input %s:", coordinate);
        final Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (final InputMismatchException e) {
            System.out.println("Please input int");
            return nextCoordinate(coordinate);
        }
    }
}
