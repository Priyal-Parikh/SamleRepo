package com.kata.TicTacToe;

import com.kata.TicTacToe.exception.TicTacToeException;

public class TicTacToe {
    public static final int MINIMUM_BOARD_DIMESION = 0;
    public static final int MAXIMUM_BOARD_DIMENSION = 3;
    private String[][] board;

    public String[][] getBoard() {
        return this.board;
    }

    public void makeaMove(String playerName, int row, int column) {

        if(row< MINIMUM_BOARD_DIMESION || row>= MAXIMUM_BOARD_DIMENSION
                || column<MINIMUM_BOARD_DIMESION || column>=MAXIMUM_BOARD_DIMENSION)
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
