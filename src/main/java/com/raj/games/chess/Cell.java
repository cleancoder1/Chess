package com.raj.games.chess;

import java.util.Optional;

public class Cell {
    private Position position;
    private Optional<? extends Piece> pieceOptional;

    public Cell(Position position, Optional<? extends Piece> pieceOptional) {
        this.position = position;
        this.pieceOptional = pieceOptional;
    }


    public Position getPosition() {
        return position;
    }

    public void setPieceOptional(Optional<? extends Piece> pieceOptional) {
        this.pieceOptional = pieceOptional;
    }

    public Optional<? extends Piece> getPieceOptional() {
        return pieceOptional;
    }
}
