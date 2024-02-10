package FireDrill;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int count = 0;

        for (int number = 1; number <= 10 ; number++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            sum += score;
            count ++;

            average =  sum /10;
        }
        System.out.println("The average is:"+ average);
    }
}
