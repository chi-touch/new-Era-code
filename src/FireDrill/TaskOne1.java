package FireDrill;

import java.util.Scanner;

public class TaskOne1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int number = 1; number <= 10 ; number++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            sum += score;


        }
        System.out.println("The sum is:" + sum);

    }
    
}
