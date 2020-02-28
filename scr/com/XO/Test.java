package com.XO;

import com.XO.model.*;
import com.XO.view.Show;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(2, 1);
        Point p4 = new Point(1, 2);
        Point p5 = new Point(2, 2);
        Field field = new Field(3);
        field.setFigures(p1, Figure.X);
        field.setFigures(p2, Figure.X);
        field.setFigures(p3, Figure.O);
        field.setFigures(p4, Figure.O);
        field.setFigures(p5, Figure.X);
        Show.ShowField(field);



    }
}
