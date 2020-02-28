package com.XO;

import com.XO.model.*;
import com.XO.view.Show;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Field field = new Field(3);
        field.setFigures(point, Figure.X);
        System.out.println(field.getFigure(point).toString());
        Show.ShowField(field);


    }
}
