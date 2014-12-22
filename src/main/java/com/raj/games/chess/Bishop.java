package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell cell) {
        return false;
//        return abs(getPosition().findSlope(position)) == 1;
    }
}
