package com.tech.model;

import com.tech.util.Position;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {
    public List<String> getPossibleMoves(Position pos) {
        List<String> moves = new ArrayList<>();
        Position forward = new Position(pos.row - 1, pos.col); // white pawn moves up
        if (forward.isValid()) {
            moves.add(forward.toChessNotation());
        }
        return moves;
    }
}
