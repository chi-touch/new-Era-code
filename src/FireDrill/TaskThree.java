package FireDrill;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average = 0;

        for (int number = 1; number <= 10 ; number++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            sum += score;

            average =  sum /score;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
