package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell cell) {
        return false;

//        return getPosition().findDistance(newPosition) == Math.sqrt(5);

    }
}
