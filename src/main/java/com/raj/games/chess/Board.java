package com.raj.games.chess;

import com.raj.games.constansts.Color;

import java.util.Optional;

import static com.raj.games.constansts.Color.Black;
import static com.raj.games.constansts.Color.White;

public class Board {
    private Cell[][] cells = new Cell[9][9];
    private Renderer renderer;

    public Board() {
        createMainPieces(1, White);
        createPawns(2, White);
        createMainPieces(8, Black);
        createPawns(7, Black);
        createEmptyCells();
    }

    private void createEmptyCells() {
        for (int i = 1; i <= 8; i++) {
            createPiece(3, i, Optional.<Piece>empty());
            createPiece(4, i, Optional.<Piece>empty());
            createPiece(5, i, Optional.<Piece>empty());
            createPiece(6, i, Optional.<Piece>empty());
        }
    }

    private void createPawns(int rowIndex, Color color) {
        for (int i = 1; i <= 8; i++) {
            createPiece(rowIndex, i, new Pawn(color));
        }
    }

    private void createMainPieces(int rowIndex, Color color) {
        createPiece(rowIndex, 1, new Rooke(color));
        createPiece(rowIndex, 2, new Knight(color));
        createPiece(rowIndex, 3, new Bishop(color));
        createPiece(rowIndex, 4, new Minister(color));
        createPiece(rowIndex, 5, new King(color));
        createPiece(rowIndex, 6, new Bishop(color));
        createPiece(rowIndex, 7, new Knight(color));
        createPiece(rowIndex, 8, new Rooke(color));
    }

    private void createPiece(int x, int y, Piece piece) {
        Cell cell = new Cell(new Position(x, y), Optional.of(piece));
        cells[x][y] = cell;
        piece.setCell(cell);
    }


    private void createPiece(int x, int y, Optional<? extends Piece> piece) {
        Cell cell = new Cell(new Position(x, y),piece);
        cells[x][y] = cell;
    }
    public Cell[][] getCells() {
        return cells;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void renderMe(){
        renderer.renderBoard(this);
    }
}
