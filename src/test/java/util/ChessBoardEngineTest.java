package util;

import com.tech.util.ChessBoardEngine;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChessBoardEngineTest {

    @Test
    public void testKingD5() {
        String result = ChessBoardEngine.getPossibleMoves("King, D5");
        assertEquals("C4, C5, C6, D4, D6, E4, E5, E6", result);
    }

    @Test
    public void testPawnG1() {
        String result = ChessBoardEngine.getPossibleMoves("Pawn, G1");
        assertEquals("G2", result);
    }

    @Test
    public void testQueenE4() {
        String result = ChessBoardEngine.getPossibleMoves("Queen, E4");
        assertEquals(
                "A4, A8, B1, B4, B7, C2, C4, C6, D3, D4, D5, E1, E2, E3, E5, E6, E7, E8, F3, F4, F5, G2, G4, G6, H1, H4, H7",
                result
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPiece() {
        ChessBoardEngine.getPossibleMoves("Knight, A1");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testBadInputFormat() {
        ChessBoardEngine.getPossibleMoves("KingD5");
    }
}
