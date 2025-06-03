package model;

import com.tech.model.Queen;
import com.tech.util.Position;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueenTest {
    @Test
    public void testQueenMovesCenter() {
        Queen queen = new Queen();
        Position pos = new Position(4, 4); // E4
        List<String> moves = queen.getPossibleMoves(pos);

        assertTrue(moves.contains("A4")); // horizontal
        assertTrue(moves.contains("E8")); // vertical
        assertTrue(moves.contains("A8")); // diagonal
        assertTrue(moves.contains("H1")); // diagonal
        assertEquals(27, moves.size());
    }
}
