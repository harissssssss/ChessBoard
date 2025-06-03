package com.tech.util;

import com.tech.factory.PieceFactory;
import com.tech.model.Piece;

import java.util.Collections;
import java.util.List;

public class ChessBoardEngine {
    public static String getPossibleMoves(String input) {
        String[] parts = input.split(",");
        String pieceType = parts[0].trim();
        String position = parts[1].trim();

        Piece piece = PieceFactory.getPiece(pieceType);
        Position pos = Position.fromChessNotation(position);

        List<String> moves = piece.getPossibleMoves(pos);
        Collections.sort(moves);
        return String.join(", ", moves);
    }
}