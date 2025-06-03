import com.tech.ChessBoard;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ChessBoardTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpStreams() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String input) {
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString().trim();
    }

    @After
    public void restoreStreams() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testMainWithKingD5() {
        provideInput("King, D5\n");
        ChessBoard.main(new String[]{});
        String output = getOutput();
        assertTrue(output.contains("Possible Moves: C4, C5, C6, D4, D6, E4, E5, E6"));
    }

    @Test
    public void testMainWithPawnG1() {
        provideInput("Pawn, G1\n");
        ChessBoard.main(new String[]{});
        String output = getOutput();
        assertTrue(output.contains("Possible Moves: G2"));
    }

    @Test
    public void testMainWithQueenE4() {
        provideInput("Queen, E4\n");
        ChessBoard.main(new String[]{});
        String output = getOutput();
        assertTrue(output.contains("Possible Moves:")); // you can verify full result if needed
    }
}
