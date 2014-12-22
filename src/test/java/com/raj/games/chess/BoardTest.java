package com.raj.games.chess;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void shouldInitalizeElementsOFBoard() {

        Board b = new Board();
        b.setRenderer(new ConsoleRenderer());
        Cell[][] cells = b.getCells();

        Cell cell = cells[1][8];

        Optional<? extends Piece> piece = cell.getPieceOptional();
        assertTrue(piece.get() instanceof  Rooke);



    }
}