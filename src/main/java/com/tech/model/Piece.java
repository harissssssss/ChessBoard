package com.tech.model;

import com.tech.util.Position;

import java.util.List;

public interface Piece {
    List<String> getPossibleMoves(Position position);
}
