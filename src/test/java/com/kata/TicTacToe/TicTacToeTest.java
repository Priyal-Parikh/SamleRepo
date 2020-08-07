package com.kata.TicTacToe;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TicTacToeTest
{

    @Test
    public void createNewTicTacToeBoard()
    {
        TicTacToe ticTacToe=new TicTacToe();
        assertNotNull(ticTacToe.getBoard());
    }
}
