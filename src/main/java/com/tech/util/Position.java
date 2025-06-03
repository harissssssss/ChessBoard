package com.tech.util;

public class Position {
    public int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static Position fromChessNotation(String notation) {
        int col = notation.charAt(0) - 'A';
        int row = 8 - Character.getNumericValue(notation.charAt(1));
        return new Position(row, col);
    }

    public String toChessNotation() {
        return "" + (char) ('A' + col) + (8 - row);
    }

    public boolean isValid() {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
