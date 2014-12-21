package com.raj.game.constants;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HorseTest {

    @org.junit.Test
    public void testHorsePosition() {

        Horse horse = new Horse();
        horse.setPosition(new Position(5,5));

        assertTrue(horse.isValidMove(new Position(6, 7)));
//        assertTrue(horse.isValidMove(new Position(4, 7)));
//        assertTrue(horse.isValidMove(new Position(4, 3)));
//        assertTrue(horse.isValidMove(new Position(6, 3)));
//        assertTrue(horse.isValidMove(new Position(6, 6)));
//        assertTrue(horse.isValidMove(new Position(6, 4)));
//        assertTrue(horse.isValidMove(new Position(3, 4)));
//        assertTrue(horse.isValidMove(new Position(3, 6)));

        assertFalse(horse.isValidMove(new Position(3, 8)));

    }


}
