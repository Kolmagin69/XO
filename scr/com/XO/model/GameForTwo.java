package com.XO.model;

public class GameForTwo {
    private Player playerOne;
    private Player playerTwo;
    private Field field;
    private String name;

    private GameForTwo() {
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

    public static Builder newBuider() {
        return new GameForTwo().new Builder();
    }
    public class Builder {
        private Builder() {
        }

        public Builder setPlayerOne(Player playerOne) {
            GameForTwo.this.playerOne = playerOne;
            return this;
        }

        public Builder setPlayerTwo(Player playerTwo) {
            GameForTwo.this.playerTwo = playerTwo;
            return this;
        }

        public Builder setField(Field field) {
            GameForTwo.this.field = field;
            return this;
        }
        public Builder setName(String name) {
            GameForTwo.this.name = name;
            return this;
        }
        public GameForTwo build() {
            return GameForTwo.this;
        }
    }
}

