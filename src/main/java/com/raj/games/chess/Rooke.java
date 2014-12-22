package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class Rooke extends Piece {
    protected Rooke(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell destination) {
        return matchesExactlyOneCoordinate(destination);
    }

    public boolean matchesExactlyOneCoordinate(Cell cell) {
        Position destination = cell.getPosition();
        Position currentPosition = getPosition();
        return isMovingInHorizontalDirection(destination, currentPosition)
                || isMovingInVerticalDirection(destination, currentPosition);
    }

    private boolean isMovingInVerticalDirection(Position destination, Position currentPosition) {
        return currentPosition.getY() == destination.getY() && currentPosition.getX() != destination.getX();
    }

    private boolean isMovingInHorizontalDirection(Position destination, Position currentPosition) {
        return currentPosition.getX() == destination.getX() && currentPosition.getY() != destination.getY();
    }

}
