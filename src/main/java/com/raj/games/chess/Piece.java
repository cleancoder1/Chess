package com.raj.games.chess;

import com.raj.games.constansts.Color;

import java.util.Optional;

public abstract class Piece {

    private final Color color;
    private Cell cell;


    protected Piece(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return cell.getPosition();
    }


    public void move(Cell newCell) {
        if (newCell.getPosition().isValid() && isValidMove(newCell)) {
            newCell.setPieceOptional(Optional.of(this));
        } else {
            throw new IllegalArgumentException("this is not a valid move");
        }
    }

    public Color getColor() {
        return color;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public abstract boolean isValidMove(Cell cell);


}
