package com.raj.games.chess;

public class King extends  Piece {
    @Override
    public boolean isValidMove(Position newPosition) {
        return getPosition().findDistance(newPosition) == Math.sqrt(2);
    }
}
