package com.XO;

import com.XO.controller.MoveController;
import com.XO.model.*;
import com.XO.model.Point;
import com.XO.view.*;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Line.arrayChar<1>.toString());

        final Field field = new Field(3);
        field.setFigures(Point.X0_Y0, Figure.X);
        field.setFigures(Point.X0_Y1, Figure.O);
        field.setFigures(Point.X0_Y2, Figure.X);
//        field.setFigures(Point.X1_Y0, Figure.O);
//        field.setFigures(Point.X1_Y1, Figure.X);
//        field.setFigures(Point.X1_Y2, Figure.O);
//        field.setFigures(Point.X2_Y0, Figure.X);
//        field.setFigures(Point.X2_Y1, Figure.O);
//        field.setFigures(Point.X2_Y2, Figure.X);
        MoveController move = new MoveController();
        System.out.println(move.currentFigure(field).toString());

//
//        final Player playerX = new Player("Nikita", Figure.X);
//        final Player playerO = new Player("Kristina", Figure.O);
//        final GameForTwo gameXO = GameForTwo
//                .newBuider()
//                .setPlayerOne(playerX)
//                .setPlayerTwo(playerO)
//                .setField(field)
//                .build();
////        Show.ShowField(field);
//        Game myGame = new Game.Builder()
//                .field(field)
//                .build();
//
//       Show.ShowField((field));
//       //field.getFigure(null);





    }
}

