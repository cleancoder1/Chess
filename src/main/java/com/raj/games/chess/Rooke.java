package com.raj.games.chess;

public class Rooke extends Piece {
    @Override
    public boolean isValidMove(Position destination) {
        return getPosition().matchesExactlyOneCoordinate(destination);
    }
}
