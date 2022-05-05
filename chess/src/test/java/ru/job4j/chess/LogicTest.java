package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void testFreeWhenIsOccupied() {
        Logic in = new Logic();
        in.add(new BishopBlack(Cell.C1));
        in.add(new BishopBlack(Cell.E3));
        Assert.assertThrows(OccupiedCellException.class, () -> in.move(Cell.C1, Cell.E3));
    }
}