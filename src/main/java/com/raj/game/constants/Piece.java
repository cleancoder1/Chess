package com.raj.game.constants;

import com.raj.games.chess.Color;

public abstract class Piece {

    private Color color;
    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(Position newPosition) {
        if (newPosition.isValid() && isValidMove(newPosition)) {
            position = newPosition;
        } else {
            throw new IllegalArgumentException("this is not a valid move");
        }
    }

    public abstract boolean isValidMove(Position position);


}
