package tictactoegame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe tacToe;
    private TicTacToe fieldSize;


    @BeforeEach
    public void initializeTicTacToe() {
        tacToe = new TicTacToe();
    }
    @Test
    public void testThatThereIsAGame(){assertNotNull(tacToe);}
    @Test
    public void testGameHas3by3(){
        assertEquals(ValueOfCell.EMPTY, tacToe.checkTable()[0][0]);}
    @Test
    public void testThatFieldIsFilled(){
        assertEquals(ValueOfCell.EMPTY, tacToe.checkTable()[1][0]);
    }
    @Test
    public void testThatGameHasTwoNumberOfPlayers() {
        assertEquals(2, tacToe.getNumberOfPlayers());
    }

    @Test
    public void testThatPlayerOneCanPlay(){
        tacToe.players(1,1);
        assertEquals(ValueOfCell.X, tacToe.checkTable()[0][0]);
    }
    @Test
    public void testThatPlayerTwoCanPlay() {
        tacToe.players(2, 6);
        assertEquals(ValueOfCell.O, tacToe.checkTable()[1][2]);
    }
    @Test
    public void testToGetTotalNumberOfField(){
        tacToe.totalField(9);
        assertEquals(9, tacToe.totalField(9));
    }
    @Test


}


