package factory;

import com.tech.factory.PieceFactory;
import com.tech.model.King;
import com.tech.model.Pawn;
import com.tech.model.Piece;
import com.tech.model.Queen;
import org.junit.Test;

import static org.junit.Assert.*;

public class PieceFactoryTest {

    @Test
    public void testCreateKing() {
        Piece piece = PieceFactory.getPiece("King");
        assertNotNull(piece);
        assertTrue(piece instanceof King);
    }

    @Test
    public void testCreateQueen() {
        Piece piece = PieceFactory.getPiece("Queen");
        assertNotNull(piece);
        assertTrue(piece instanceof Queen);
    }

    @Test
    public void testCreatePawn() {
        Piece piece = PieceFactory.getPiece("Pawn");
        assertNotNull(piece);
        assertTrue(piece instanceof Pawn);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPieceThrowsException() {
        PieceFactory.getPiece("Bishop");
    }
}

