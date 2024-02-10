package FireDrill;

import java.util.Scanner;

public class HighestAndLowest {

    public static String highestAndLowest(int[] numbers) {
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest)highest = numbers[i];
            if (numbers[i] < lowest)lowest = numbers[i];
        }
        return highest+","+lowest;
    }
    private static int input(String words){
        Scanner scanner = new Scanner(System.in);
        System.out.print(words);
        return scanner.nextInt();
    }

    private static  String getLargestAndLowest(int number){
        int valueCollector =  input("Enter number 1: ");
        int highest = valueCollector, lowest = valueCollector;
        for (int i = 1; i <= number-1; i++) {
            valueCollector =  input("Enter number "+ (i+1)+ ": ");
            if (valueCollector > highest) highest = valueCollector;
            if (valueCollector< lowest) lowest = valueCollector;

        }
        return highest+","+lowest;
    }

    public static void main(String[] args) {
        int number = input("how many numbers do you want to compare ? : ");
        System.out.println(getLargestAndLowest(number));
    }
}
