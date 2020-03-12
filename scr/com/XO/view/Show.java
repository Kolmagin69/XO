package com.XO.view;

import com.XO.model.Field;
import com.XO.model.*;

public class Show {

    public static void showField(final GameForTwo gameForTwo) {
        StringBuilder strLocal1 = new StringBuilder(Lines.TOP_LINE);
        for (int j = 0; j < gameForTwo.getField().getSize() ; j++) {
            if(j < gameForTwo.getField().getSize() - 1) {
                strLocal1.append(horizontalLine(j, gameForTwo.getField()) + Lines.MIDEL_LINE);
            } else {
                strLocal1.append(horizontalLine(j, gameForTwo.getField()) + Lines.BOTTOM_LINE);
            }
        }
        System.out.println(strLocal1);

    }

    private static String horizontalLine(final int a, final Field field) {
        Figure[][] figureLocal = field.getFigures();
        StringBuilder strLocal = new StringBuilder();
        for (int i = 0; i < field.getSize(); i++) {
            Figure figureInMetod = figureLocal[a][i];
            if(figureInMetod == null) {
                strLocal.append(appendSpace(" "));
            } else {
                strLocal.append(appendSpace(figureInMetod.toString()));
            }
        }
        return Lines.DASH_VERTICAL + strLocal.toString() + "\n";
    }
    private  static String appendSpace(final String str) {
        return "  " + str + "  " + Lines.DASH_VERTICAL;
    }

    private static class Lines{
        private static final char DASH_HORIZONTAL = '\u2501';
        private static final char DASH_VERTICAL = '\u2503';

        private static final char UP_LEFT = '\u250F';
        private static final char UP_RIGHT = '\u2513';
        private static final char UP_MIDEL = '\u2533';

        private static final char MIDEL_LEFT = '\u2523';
        private static final char MIDEL_MIDEL = '\u254B';
        private static final char MIDEL_RIGHT = '\u252B';

        private static final char DOWN_LEFT = '\u2517';
        private static final char DOWN_MIDEL = '\u253B';
        private static final char DOWN_RIGHT = '\u251B';


        private static final String TOP_LINE = new String(new char[]{
                UP_LEFT, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                UP_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                UP_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                UP_RIGHT, '\n'});

        private static final String MIDEL_LINE = new String(new char[]{
                MIDEL_LEFT, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                MIDEL_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                MIDEL_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                MIDEL_RIGHT, '\n'});

        private static final String BOTTOM_LINE = new String(new char[]{
                DOWN_LEFT, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                DOWN_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                DOWN_MIDEL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL, DASH_HORIZONTAL,
                DOWN_RIGHT, '\n'});
        }

    }

