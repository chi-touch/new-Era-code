package tictactoegame;

public class GameBoard {
    private int pickANumber;
    private java.lang.String checkWinner;



    String[][] gameBoard = new String[3][3];
    public boolean getBoard() {
        return true;
    }

    public ValueOfCell getNumberFields() {
        for (String[] board : gameBoard){
            for (int field = 0; field <board.length; field++) {
                board[field] = String.valueOf(ValueOfCell.EMPTY);


            }
        }
        System.out.println(ValueOfCell.EMPTY);
        return ValueOfCell.EMPTY;
    }

}
