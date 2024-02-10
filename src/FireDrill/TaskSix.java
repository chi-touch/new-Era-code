package FireDrill;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        double average = 0;

        for (int number = 1; number <=10 ; number++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            if(count % 2 ==0)
                sum+=count;
            count ++;
                average = sum/10;



        }
        System.out.println(average);
    }
}
