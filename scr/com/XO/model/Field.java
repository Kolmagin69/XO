package com.XO.model;

public class Field {
    private int size;
    private Figure[] figures;

    public Field(int size) {
        this.size = size;
        figures = new Figure[size];
    }
}
