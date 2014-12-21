package com.raj.game.constants;

import static java.lang.Math.abs;

public class Bishop extends Piece {
    @Override
    public boolean isValidMove(Position position) {
        return abs(getPosition().findSlope(position)) == 1;
    }
}
