package com.raj.game.constants;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BishopTest {

    @Test
    public void testPosition() {

        Bishop b = new Bishop();
        b.setPosition( new Position(5,5));

        assertThat(b.isValidMove(new Position(6, 6)), is(true));

    }
}
