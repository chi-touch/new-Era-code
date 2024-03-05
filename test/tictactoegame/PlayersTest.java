package tictactoegame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {
    private Players player;
    @BeforeEach
    public void initializePlayers(){
        player = new Players();
    }
    @Test
    public void testGameHas3by3(){
        assertEquals(ValueOfCell.EMPTY, player.checkTable()[0][0]);}
    @Test
    public void testThatFieldIsFilled(){
        assertEquals(ValueOfCell.EMPTY, player.checkTable()[1][0]);
    }
    @Test
    public void testThatGameHasTwoNumberOfPlayers() {
        assertEquals(2, player.getNumberOfPlayers());
    }

    @Test
    public void testThatPlayerOneCanPlay(){
        player.play(1,1);
        assertEquals(ValueOfCell.X, player.checkTable()[0][0]);
    }
    @Test
    public void testThatPlayerTwoCanPlay() {
        player.play(2, 6);
        assertEquals(ValueOfCell.O, player.checkTable()[1][2]);
    }
    @Test
    public void testToGetTotalNumberOfField(){
        player.totalField(9);
        assertEquals(9, player.totalField(9));
    }
//    @Test
//    public void testThereIsAWinner(){
//        tacToe.winner(1);
//        assertEquals(1,tacToe.getNumberOfFields());
//    }

    @Test
    public void testThatOnlyTwoPlayersCanPlay(){
        assertThrows(InvalidPlayerException.class,()->player.play(3,1));
    }
    @Test
    public void testThatNumbersGreaterThan9CantBePlayed(){
        assertThrows(InvalidFieldNumberException.class,()->player.play(1,20));
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
        player.play(1,1);
        player.play(1,4);
        player.play(1,7);
        assertEquals(1, player.getWinner());
        System.out.println(player.getWinner());



    }
    @Test
    public void testToGetRow1ForPlayer2Winning() {
        player.play(2, 1);
        player.play(2, 4);
        player.play(2, 7);


    }

    @Test
    public void testForColumn2ForPlayer1(){
        player.play(1,7);
        player.play(1,8);
        player.play(1,9);


    }

    @Test
    public void testForColumn2ForPlayer2(){
        player.play(2,4);
        player.play(2,5);
        player.play(2,6);



    }


}



