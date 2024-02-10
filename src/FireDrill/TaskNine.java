package FireDrill;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;


        for (int number = 1; number <=10 ; number++) {
            System.out.println("Enter score number between 0 to 100:");
            int score = input.nextInt();
            if(score >= 0 && score <=100) {
                  sum += score;
                }else {
                    System.out.println("number is invalid");}






        }
        System.out.println("The sum is:"+sum);
    }
}
