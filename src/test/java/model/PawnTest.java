package model;

import com.tech.model.Pawn;
import com.tech.util.Position;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PawnTest {
    @Test
    public void testPawnMovesNormal() {
        Pawn pawn = new Pawn();
        Position pos = new Position(6, 3); // D2
        List<String> moves = pawn.getPossibleMoves(pos);

        assertEquals(1, moves.size());
        assertEquals("D3", moves.get(0));
    }

    @Test
    public void testPawnAtTopEdge() {
        Pawn pawn = new Pawn();
        Position pos = new Position(0, 4); // E8
        List<String> moves = pawn.getPossibleMoves(pos);

        assertEquals(0, moves.size()); // Can't go beyond board
    }
}