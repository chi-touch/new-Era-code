package tictactoegame;


import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to Tic Tac Toe!
                First player  takes X
                Second player takes O
                
                """);
        System.out.println("First player enter the position you want to play");
        int position = input.nextInt();


        System.out.println("Second player enter the position you want to play");
        position = input.nextInt();

        int count = 0;



//        System.out.println("First Player takes X");
//        int player = input.nextInt();
//        System.out.println("Second Player takes O");
//        System.out.println("Enter the number to show which player is playing");
        int player = input.nextInt();

        ticTacToe.play( player,  position);
//        ticTacToe.checkTable();
//        ticTacToe.checkVertical();
//        ticTacToe.checkHorizontal();
//        ticTacToe.checkDiagonalRight();
//        ticTacToe.checkDiagonalLeft();
//        ticTacToe.getWinner();


        while( count != 10) {

            System.out.println("First player enter the position you want to play");
            position = input.nextInt();
            System.out.println("Second player enter the position you want to play");
            position = input.nextInt();

            ticTacToe.checkTable();
        ticTacToe.checkVertical();
        ticTacToe.checkHorizontal();
        ticTacToe.checkDiagonalRight();
        ticTacToe.checkDiagonalLeft();



            count ++;



        }






    }


}
