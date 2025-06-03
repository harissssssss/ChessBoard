package com.tech.factory;


import com.tech.model.*;

public class PieceFactory {
    public static Piece getPiece(String name) {
        return switch (name.toLowerCase()) {
            case "king" -> new King();
            case "queen" -> new Queen();
            case "pawn" -> new Pawn();
            default -> throw new IllegalArgumentException("Invalid piece type: " + name);
        };
    }
}