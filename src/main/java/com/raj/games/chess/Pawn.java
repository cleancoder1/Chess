package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell cell) {
        return false;
    }
}
