package com.XO.view;

import com.XO.model.Field;
import com.XO.model.*;

public class Show {

    private static final String crossLine = "-----------\n";
    public static void ShowField(final Field field) {


        System.out.println(crossLine);
    }
    private String horizontalLine(final int a, final Field field) {
        Figure[][] figureLocal = field.getFigures();
        StringBuilder strLocal = new StringBuilder();
        for (int i = 0; i < field.getSize(); i++) {
            figureLocal[a][i] = Figure.X;
        }
        return "qwq";
    }
}
