package com.XO.view;

import com.XO.model.Field;
import com.XO.model.*;

public class Show {

    private static final String crossLine = "-------------\n";

    public static void ShowField(final Field field) {
        StringBuilder strLocal1 = new StringBuilder(crossLine);
        for (int j = 0; j < field.getSize() ; j++) {
            strLocal1.append(horizontalLine(j, field) + crossLine);
        }
        System.out.println(strLocal1);
    }

    private static String horizontalLine(final int a, final Field field) {
        Figure[][] figureLocal = field.getFigures();
        StringBuilder strLocal = new StringBuilder("|");
        for (int i = 0; i < field.getSize(); i++) {
            Figure figureInMetod = figureLocal[a][i];
            if(figureInMetod == null) {
                strLocal.append(appendSpace(" "));
            } else {
                strLocal.append(appendSpace(figureInMetod.toString()));
            }
        }
        return strLocal.toString() + "\n";
    }
    private  static String appendSpace(final String str) {
        return " " + str + " |";
    }
}
