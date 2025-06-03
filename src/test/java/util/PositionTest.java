package util;

import com.tech.util.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void testFromChessNotation_A1() {
        Position pos = Position.fromChessNotation("A1");
        assertEquals(7, pos.row);  // A1 is row 8 => index 7
        assertEquals(0, pos.col);  // A is column 1 => index 0
    }

    @Test
    public void testFromChessNotation_H8() {
        Position pos = Position.fromChessNotation("H8");
        assertEquals(0, pos.row);  // row 8 => index 0
        assertEquals(7, pos.col);  // H => index 7
    }

    @Test
    public void testToChessNotation() {
        Position pos = new Position(4, 2); // should be C4
        assertEquals("C4", pos.toChessNotation());
    }

    @Test
    public void testIsValid_True() {
        Position pos = new Position(3, 5);
        assertTrue(pos.isValid());
    }

    @Test
    public void testIsValid_False_Negative() {
        Position pos = new Position(-1, 5);
        assertFalse(pos.isValid());
    }

    @Test
    public void testIsValid_False_Overflow() {
        Position pos = new Position(8, 0);
        assertFalse(pos.isValid());
    }
}
