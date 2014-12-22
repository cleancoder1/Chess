package com.raj.games.chess;

public class Horse extends Piece {


    @Override
    public boolean isValidMove(Position newPosition) {

        return getPosition().findDistance(newPosition) == Math.sqrt(5);

    }
}
