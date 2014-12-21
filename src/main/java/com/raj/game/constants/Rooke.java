package com.raj.game.constants;

public class Rooke extends Piece {
    @Override
    public boolean isValidMove(Position destination) {
        return getPosition().matchesExactlyOneCoordinate(destination);
    }
}
