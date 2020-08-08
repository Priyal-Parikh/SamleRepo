package com.kata.TicTacToe;

import org.junit.Test;

import static org.junit.Assert.*;


public class TicTacToeTest
{

    @Test
    public void createNewTicTacToeBoard()
    {
        TicTacToe ticTacToe=new TicTacToe();

        assertNotNull(ticTacToe.getBoard());
    }


    @Test
    public void playerXmakesTheFirstMove()
    {
        TicTacToe ticTacToe=new TicTacToe();

        ticTacToe.makeaMove("X", 0, 0);

        assertEquals("X",ticTacToe.getBoard()[0][0]);
    }
}
