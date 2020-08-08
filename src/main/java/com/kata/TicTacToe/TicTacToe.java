package com.kata.TicTacToe;

import com.kata.TicTacToe.exception.TicTacToeException;

public class TicTacToe {
    private String[][] board;

    public String[][] getBoard() {
        return this.board;
    }

    public void makeaMove(String playerName, int row, int column) {

        if(row<0 || row>=3  || column<0 || column>=3)
        {
            throw new TicTacToeException("Player Cannot Move to Incorrect Position.");
        }
        if(!"O".equalsIgnoreCase(playerName) && !"X".equalsIgnoreCase(playerName)) {
            throw new TicTacToeException("Only X or O players can make move.");
        }

        if(this.board==null)
        {
            if("O".equalsIgnoreCase(playerName))
            {
                throw new TicTacToeException(playerName+" cannot make first move.");
            }
            this.board=new String[3][3];
        }

        if(this.board[row][column]!=null)
        {
            throw new TicTacToeException(playerName+" cannot move to a played position.");
        }
        this.board[row][column]=playerName;

    }
}
