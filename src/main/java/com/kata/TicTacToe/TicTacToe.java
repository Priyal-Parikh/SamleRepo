package com.kata.TicTacToe;

import com.kata.TicTacToe.exception.TicTacToeException;

public class TicTacToe {
    private final String[][] board;

    public String[][] getBoard() {
        return this.board;
    }

    public TicTacToe() {
        this.board=new String[3][3];
    }

    public void makeaMove(String playerName, int row, int column) {
        if(this.board[row][column]!=null)
        {
            throw new TicTacToeException(playerName+" cannot move to a played position.");
        }
        this.board[row][column]=playerName;
    }
}
