package com.kata.TicTacToe;

public class TicTacToe {
    private final String[][] board;

    public String[][] getBoard() {
        return this.board;
    }

    public TicTacToe() {
        this.board=new String[3][3];
    }
}
