package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    @DisplayName("Test position method")
    void testPosition() {
        BishopBlack testBishop = new BishopBlack(Cell.A6);
        Cell out = testBishop.position();
        Cell expected = Cell.A6;
        assertEquals(expected, out);
    }

    @Test
    void way() {
//        BishopBlack testBishopBlack = new BishopBlack(Cell.C1);
//        Cell[] out = testBishopBlack.way(Cell.G5);
//        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
//        assertEquals(expected, out);
    }

    @Test
    void isDiagonal() {
    }

    @Test
    @DisplayName("Test copy method")
    void testCopy() {
        BishopBlack testBishop = new BishopBlack(Cell.A6);
        BishopBlack out = (BishopBlack) testBishop.copy(Cell.D4);
        assertEquals(out.position(), Cell.D4);
    }
}