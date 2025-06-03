package model;

import com.tech.model.King;
import com.tech.util.Position;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class KingTest {
    @Test
    public void testKingMovesMiddleBoard() {
        King king = new King();
        Position pos = new Position(3, 3); // D5
        List<String> moves = king.getPossibleMoves(pos);

        assertEquals(8, moves.size());
        assertTrue(moves.contains("C4"));
        assertTrue(moves.contains("E4"));
        assertTrue(moves.contains("D6"));
    }

    @Test
    public void testKingMovesCorner() {
        King king = new King();
        Position pos = new Position(0, 0); // A8
        List<String> moves = king.getPossibleMoves(pos);

        assertEquals(3, moves.size());
        assertTrue(moves.contains("A7"));
        assertTrue(moves.contains("B8"));
        assertTrue(moves.contains("B7"));
    }
}
