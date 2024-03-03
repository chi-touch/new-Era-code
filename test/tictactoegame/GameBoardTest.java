package tictactoegame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {
    private GameBoard gameBoard;

    @BeforeEach
    public void initializeGameBoard(){
        gameBoard = new GameBoard();
    }

    @Test
    public void testThatThereIsABoard(){
        assertTrue(gameBoard.getBoard());
    }

    @Test
    public void testThatTheFieldsOnTheBoardIsEmpty(){
        assertEquals(ValueOfCell.EMPTY,gameBoard.getNumberFields());
    }


//    @Test
//    public void testThatFieldOnTheBoardIsEmpty(){
//        assertEquals(ValueOfCell.EMPTY,gameBoard.getCell(1));
//    }




}