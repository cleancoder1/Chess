package com.raj.games.chess;

import com.raj.games.constansts.Color;

public class Minister extends Piece {

    public Minister(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Cell position) {
        return false;
    }
}
