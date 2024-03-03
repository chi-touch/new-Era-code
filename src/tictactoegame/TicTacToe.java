package tictactoegame;

import java.util.Arrays;

public class TicTacToe {

    private ValueOfCell[][] table = new ValueOfCell[3][3];

    private int numberOfPlayers = 2;
    private int numberOfField = 9;

    public TicTacToe() {
        for (ValueOfCell[] valueOfCells : table) {
            Arrays.fill(valueOfCells, ValueOfCell.EMPTY);
        }
    }

    public ValueOfCell[][] checkTable() {
        return table;
    }

    public void players(int player, int position) {
        if (player == 1 && position == 1) {
            table[0][0] = ValueOfCell.X;
        }
        if (player == 1 && position == 2) {
            table[0][1] = ValueOfCell.X;
        }
        if (player == 1 && position == 3) {
            table[0][2] = ValueOfCell.X;
        }

        if (player == 1 && position == 4) {
            table[1][0] = ValueOfCell.X;
        }
        if (player == 1 && position == 5) {
            table[1][1] = ValueOfCell.X;
        }
        if (player == 1 && position == 6) {
            table[1][2] = ValueOfCell.X;
        }

        if (player == 1 && position == 7) {
            table[2][0] = ValueOfCell.X;
        }
        if (player == 1 && position == 8) {
            table[2][1] = ValueOfCell.X;
        }
        if (player == 1 && position == 9) {
            table[2][2] = ValueOfCell.X;
        }


        if (player == 2 && position == 1) {
            table[0][0] = ValueOfCell.O;
        }
        if (player == 2 && position == 2) {
            table[0][1] = ValueOfCell.O;
        }
        if (player == 2 && position == 3) {
            table[0][2] = ValueOfCell.O;
        }
        if (player == 2 && position == 4) {
            table[1][0] = ValueOfCell.O;
        }
        if (player == 2 && position == 5) {
            table[1][1] = ValueOfCell.O;
        }
        if (player == 2 && position == 6) {
            table[1][2] = ValueOfCell.O;
        }
        if (player == 2 && position == 7) {
            table[2][0] = ValueOfCell.O;
        }
        if (player == 2 && position == 8) {
            table[2][1] = ValueOfCell.O;
        }
        if (player == 2 && position == 9) {
            table[2][2] = ValueOfCell.O;
        }
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int totalField(int number) {
        return numberOfField;
    }
}


































//
//
//   public TicTacToe(){
//      for(String [] board: gameBoard){
//
//         for (int i = 0; i < board.length; i++) {
//            board[i] = String.valueOf(ValueOfEachCell.EMPTY);
//
//         }
//      }
//   }
//
//   public boolean board() {
//      return true;
//   }
//
//
//   public String getCell(int cellNumber) {
//      if (cellNumber <= 3 && cellNumber >= 0){
//         gameBoard[0][cellNumber - 1] = Player.getSymbol;
//         return "Played";
//
//      }
//
//     else if (cellNumber >= 4 && cellNumber <= 6){
//         return gameBoard[1][cellNumber - 4];
//
//      }
//
//     else if (cellNumber >= 7 && cellNumber <= 9){
//         return gameBoard[2][cellNumber - 7];
//
//      }
//      return "not found";
//   }
//}
