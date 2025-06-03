package com.tech;

import com.tech.factory.PieceFactory;
import com.tech.model.Piece;
import com.tech.util.Position;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input (e.g., King, D5): ");
        String[] input = scanner.nextLine().split(",");
        String pieceType = input[0].trim();
        String position = input[1].trim();

        Piece piece = PieceFactory.getPiece(pieceType);
        Position pos = Position.fromChessNotation(position);

        List<String> moves = piece.getPossibleMoves(pos);
        Collections.sort(moves);
        System.out.println("Possible Moves: " + String.join(", ", moves));
    }
}