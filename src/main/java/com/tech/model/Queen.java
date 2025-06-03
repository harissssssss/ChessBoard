package com.tech.model;

import com.tech.util.Position;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {
    private static final int[] DX = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] DY = {-1, 0, 1, -1, 1, -1, 0, 1};

    public List<String> getPossibleMoves(Position pos) {
        List<String> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int r = pos.row + DX[i], c = pos.col + DY[i];
            while (r >= 0 && r < 8 && c >= 0 && c < 8) {
                moves.add(new Position(r, c).toChessNotation());
                r += DX[i];
                c += DY[i];
            }
        }
        return moves;
    }
}
