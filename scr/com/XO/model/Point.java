package com.XO.model;

public enum Point {
    X0_Y0(0, 0),
    X0_Y1(0, 1),
    X0_Y2(0, 2),
    X1_Y0(1, 0),
    X1_Y1(1, 1),
    X1_Y2(1, 2),
    X2_Y0(2, 0),
    X2_Y1(2, 1),
    X2_Y2(2, 2);

   private int x;
   private int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point getPoint(final int x, final int y) {

        if(x == 0 && y ==0) return X0_Y0;
        if(x == 0 && y ==1) return X0_Y1;
        if(x == 0 && y ==2) return X0_Y2;
        if(x == 1 && y ==0) return X1_Y0;
        if(x == 1 && y ==1) return X1_Y1;
        if(x == 1 && y ==2) return X1_Y2;
        if(x == 2 && y ==0) return X2_Y0;
        if(x == 2 && y ==1) return X2_Y1;
        if(x == 2 && y ==2) return X2_Y2;
        return  null;
    }

}
