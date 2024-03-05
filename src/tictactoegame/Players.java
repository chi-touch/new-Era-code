package tictactoegame;

import java.util.Arrays;

public class Players extends TicTacToe{

    private ValueOfCell[][] table = new ValueOfCell[3][3];


    public ValueOfCell[][] checkTable() {

        return table;
    }


    private int player1;
    private int player2;



    public void play(int player, int position) {
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
        if (player == 3 && position == 1) {
            throw new InvalidPlayerException("Invalid player");
        }
        if (player == 1 && position == 20) {
            throw new InvalidFieldNumberException("Invalid position");
        }
    }


}
