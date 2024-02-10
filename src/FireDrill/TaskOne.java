package FireDrill;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[]args){


        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        while(number != 22){
            System.out.println("Enter number between 1 to 15");
            number = input.nextInt();
            if(number >0 && number <=15){
                numbers.add(number);

            }
        }
        for (int count = 0; count < numbers.size() ; count++) {
            for (int counter = 0; counter <numbers.get(count);counter++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
