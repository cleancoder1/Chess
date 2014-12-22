package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class King extends Piece {

    protected King(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell cell) {
        return false;
//        return getPosition().findDistance(newPosition) == Math.sqrt(2);
    }
}
