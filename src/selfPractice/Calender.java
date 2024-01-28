package selfPractice;

import java.util.Arrays;

public class Calender {

    public static void main(String[]args){


        int[][] calender = new int[3][5];

        calender[0][2] = 10;
        calender[1][2] = 20;
        calender[2][2] = 30;

        System.out.println(Arrays.deepToString(calender));
    }
}
