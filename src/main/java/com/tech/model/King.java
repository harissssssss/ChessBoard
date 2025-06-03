package com.tech.model;

import com.tech.util.Position;

import java.util.*;

public class King implements Piece {
    private static final int[] DX = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] DY = {-1, 0, 1, -1, 1, -1, 0, 1};

    public List<String> getPossibleMoves(Position pos) {
        List<String> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Position next = new Position(pos.row + DX[i], pos.col + DY[i]);
            if (next.isValid()) {
                moves.add(next.toChessNotation());
            }
        }
        return moves;
    }
}
