package FireDrill;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int number = 1; number <=10 ; number++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            if(count % 2 !=0)
                sum+=count;
            count ++;


        }
        System.out.println(sum);

    }
}
