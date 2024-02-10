package FireDrill;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;


        for (int number = 1; number <=10 ; number++) {
            System.out.println("Enter score number between 0 to 100:");
            int score = input.nextInt();

            while (score < 0 || score > 100) {

                System.out.println("The number is invalid");
                score = input.nextInt();
            }
                     sum += score;

        }
        System.out.println("The sum is:" + sum);
    }
}
