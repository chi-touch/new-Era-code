package tictactoegame;

import java.util.Arrays;


public class TicTacToe {

    private ValueOfCell[][] table = new ValueOfCell[3][3];

    private int numberOfPlayers = 2;
    private int numberOfField = 9;
    private int winner;

    public TicTacToe() {
        for (ValueOfCell[] valueOfCells : table) {
            Arrays.fill(valueOfCells, ValueOfCell.EMPTY);
        }
    }

    public ValueOfCell[][] checkTable() {

        return table;
    }



    public void play(int player, int position) {
        if (player == 1 && position == 1) {
            table[0][0] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 1) {
            table[0][0] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 2) {
            table[0][1] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 2) {
            table[0][1] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 3) {
            table[0][2] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 3) {
            table[0][2] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 4) {
            table[1][0] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 4) {
            table[1][0] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 5) {
            table[1][1] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 5) {
            table[1][1] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 6) {
            table[1][2] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 6) {
            table[1][2] = ValueOfCell.X;
            checkColumn2Win();
        }

        if (player == 1 && position == 7) {
            table[2][0] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 7) {
            table[2][0] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 8) {
            table[2][1] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 8) {
            table[2][1] = ValueOfCell.X;
            checkColumn2Win();
        }
        if (player == 1 && position == 9) {
            table[2][2] = ValueOfCell.X;
            checkRow1Win();
        }
        if (player == 1 && position == 9) {
            table[2][2] = ValueOfCell.X;
            checkColumn2Win();
        }


        if (player == 2 && position == 1) {
            table[0][0] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 1) {
            table[0][0] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 2) {
            table[0][1] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 2) {
            table[0][1] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 3) {
            table[0][2] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 3) {
            table[0][2] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 4) {
            table[1][0] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 4) {
            table[1][0] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 5) {
            table[1][1] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 5) {
            table[1][1] = ValueOfCell.O;
            checkColumn2Win();
        }

        if (player == 2 && position == 6) {
            table[1][2] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 6) {
            table[1][2] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 7) {
            table[2][0] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 7) {
            table[2][0] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 8) {
            table[2][1] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 8) {
            table[2][1] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 2 && position == 9) {
            table[2][2] = ValueOfCell.O;
            checkRow1Win();
        }
        if (player == 2 && position == 9) {
            table[2][2] = ValueOfCell.O;
            checkColumn2Win();
        }
        if (player == 3 && position == 1) {
            throw new InvalidPlayerException("Invalid player");
        }
        if (player == 1 && position == 20) {
            throw new InvalidFieldNumberException("Invalid position");
        }

    }



    public void checkRow1Win(){
        if(table[0][0]==ValueOfCell.X && table[1][0] ==ValueOfCell.X&&table[2][0]==ValueOfCell.X){
            winner = 1;
        }
        if (table[0][0]==ValueOfCell.O&&table[1][0]==ValueOfCell.O && table[2][0]==ValueOfCell.O) {
           winner =2;
        }
        if(table[0][1]==ValueOfCell.X&&table[1][1]==ValueOfCell.X&& table[2][1]==ValueOfCell.X){
            winner =1;
        }
        if(table[0][1]==ValueOfCell.O&&table[1][1]==ValueOfCell.O&& table[2][1]==ValueOfCell.O){
            winner = 2;
        }
        if(table[0][2]==ValueOfCell.X&&table[1][2]==ValueOfCell.X&& table[2][2]==ValueOfCell.X){
            winner = 1;
        }
        if(table[0][2]==ValueOfCell.O&&table[1][2]==ValueOfCell.O&& table[2][2]==ValueOfCell.O){
            winner = 2;
        }



    }

    public void checkColumn2Win(){
        if(table[0][0] ==ValueOfCell.X &&table[0][1]==ValueOfCell.X &&table[0][2]==ValueOfCell.X){
            winner=1;
        }
        if(table[0][0] ==ValueOfCell.O &&table[0][1]==ValueOfCell.O &&table[0][2]==ValueOfCell.O){
            winner =2;
        }
        if(table[1][0]==ValueOfCell.X && table[1][1]==ValueOfCell.X && table[1][2]==ValueOfCell.X){
            winner =1;
        }
        if(table[1][0]==ValueOfCell.O && table[1][1]==ValueOfCell.O && table[1][2]==ValueOfCell.O){
            winner =2;
        }
        if(table[2][0]==ValueOfCell.X && table[2][1]==ValueOfCell.X && table[2][2]==ValueOfCell.X){
            winner =1;
        }
        if(table[2][0]==ValueOfCell.O && table[2][1]==ValueOfCell.O && table[2][2]==ValueOfCell.O){
            winner =2;
        }

    }

    public void checkDigonalWin(){
        if (table[2][0]==ValueOfCell.X && table[1][1]==ValueOfCell.X && table[0][2]==ValueOfCell.X){
            winner =1;
        }
        if (table[2][0]==ValueOfCell.O && table[1][1]==ValueOfCell.O && table[0][2]==ValueOfCell.O){
            winner=2;
        }

    }


    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int totalField(int number) {
        return numberOfField;
    }

    public int getWinner() {
        return winner;
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
