package com.kata.TicTacToe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TicTacToeTest
{
    public static final String PLAYER_ONE_NAME = "X";
    TicTacToe ticTacToe;

    @Before
    public void setUp()
    {
        ticTacToe=new TicTacToe();
    }

    @Test
    public void createNewTicTacToeBoard()
    {
        assertNotNull(ticTacToe.getBoard());
    }

    @Test
    public void playerXmakesTheFirstMove()
    {
        ticTacToe.makeaMove(PLAYER_ONE_NAME, 0, 0);

        assertEquals("X",ticTacToe.getBoard()[0][0]);
    }

}
