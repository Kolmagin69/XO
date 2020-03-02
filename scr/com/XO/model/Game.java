package com.XO.model;

public class Game {
    private final Player playerOne;
    private final Player playerTwo;
    private final Field field;
    private final String name;

    public Game(Builder builder) {
        this.playerOne = builder.getPlayerOne();
        this.playerTwo = builder.getPlayerTwo();
        this.field = builder.getField();
        this.name = builder.getName();
        }

    public static class Builder {
        private Player playerOne;
        private Player playerTwo;
        private Field field;
        private String name;

        public Builder playerOne(final Player playerOne) {
            this.playerOne = playerOne;
            return  this;
            }
        public Builder field(final Field field) {
            this.field = field;
            return this;
        }
        public Builder playerTwo(final Player playerTwo) {
            this.playerTwo = playerTwo;
            return  this;
        }
        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        private Player getPlayerOne() {
            return playerOne;
        }

        private Player getPlayerTwo() {
            return playerTwo;
        }

        public String getName() {
            return name;
        }

        private Field getField() {
            return field;
        }
        public Game build() {
            return new Game(this);
        }


    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Field getField() {
        return field;
    }
    public String getName() {
        return name;
    }
}
