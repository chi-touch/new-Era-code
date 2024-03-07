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
        tacToe.play(1,1);
        assertEquals(ValueOfCell.X, tacToe.checkTable()[0][0]);
    }
    @Test
    public void testThatPlayerTwoCanPlay() {
        tacToe.play(2, 6);
        assertEquals(ValueOfCell.O, tacToe.checkTable()[1][2]);
    }
    @Test
    public void testToGetTotalNumberOfField(){
        tacToe.totalField(9);
        assertEquals(9, tacToe.totalField(9));
    }
//    @Test
//    public void testThereIsAWinner(){
//        tacToe.winner(1);
//        assertEquals(1,tacToe.getNumberOfFields());
//    }

    @Test
    public void testThatOnlyTwoPlayersCanPlay(){
        assertThrows(InvalidPlayerException.class,()->tacToe.play(3,1));
    }
    @Test
    public void testThatNumbersGreaterThan9CantBePlayed(){
        assertThrows(InvalidFieldNumberException.class,()->tacToe.play(1,20));
    }
//    @Test
//    public void testThatPlayerOneCanWin(){
//        //assertNull(tacToe.getWinner());
//        tacToe.play(1, 1);
//        tacToe.play(1, 2);
//        tacToe.play(1, 3);
//
//        //assertNotNull(tacToe.getWinner());
//        assertEquals(ValueOfCell.X, tacToe.getWinner());
//
//        System.out.println(tacToe.getWinner());
//    }



    @Test
    public void testToGetRow1ForPlayer1Winning(){
        tacToe.play(1,1);
        tacToe.play(1,2);
        tacToe.play(1,3);
        System.out.println(Arrays.deepToString(tacToe.checkTable()));
        assertEquals(1, tacToe.getWinner());
        System.out.println(tacToe.getWinner());

    }
    @Test
    public void testToGetRow1ForPlayer2Winning() {
        tacToe.play(2, 1);
        tacToe.play(2, 4);
        tacToe.play(2, 7);
        System.out.print(Arrays.deepToString(tacToe.checkTable()));
        assertEquals(2, tacToe.getWinner());
        System.out.println(tacToe.getWinner());


    }

    @Test
    public void testForColumn2ForPlayer1(){
        tacToe.play(1,7);
        tacToe.play(1,8);
        tacToe.play(1,9);
        assertEquals(1, tacToe.getWinner());


    }

    @Test
    public void testForColumn2ForPlayer2(){
        tacToe.play(2,4);
        tacToe.play(2,5);
        tacToe.play(2,6);



    }


}


