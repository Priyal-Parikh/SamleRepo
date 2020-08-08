package com.kata.TicTacToe;

import com.kata.TicTacToe.exception.TicTacToeException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TicTacToeTest
{

    public static final String PLAYER_ONE_NAME = "X";
    TicTacToe ticTacToe;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();


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
    public void playerMakesTheMove()
    {
        ticTacToe.makeaMove(PLAYER_ONE_NAME, 0, 0);

        assertEquals(PLAYER_ONE_NAME,ticTacToe.getBoard()[0][0]);
    }

    @Test
    public void playerCannotPlayOnPlayedPosition()
    {
        ticTacToe.makeaMove(PLAYER_ONE_NAME, 0,0);

        exceptionRule.expect(TicTacToeException.class);
        exceptionRule.expectMessage(PLAYER_ONE_NAME+" cannot move to a played position.");

        ticTacToe.makeaMove(PLAYER_ONE_NAME, 0,0);
    }


}
