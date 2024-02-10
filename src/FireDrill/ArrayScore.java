/*
package FireDrill3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScore {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score =0;
        int [] numbers = new int[10];

        for (int count = 0; count <10 ; count++) {
            System.out.print("Enter 10 scores:");
            score = input.nextInt();
            numbers[count] = score;

        }

        System.out.println(Arrays.toString(numbers));

    }

    public static int [] outputArray(int...score) {
       int []numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = score[i];

            System.out.print(numbers[i]+" ");

        }
        return  numbers;

    }

    public static int[] outputArray1(int... score) {
        int[] scores = new int[10];
        for (int index = 0; index < scores.length; index++) {
            scores[index] = score[index];

            System.out.println(scores[index]);

        }
        return scores;

   }

    public static int[] outputArray2(int ...numbers1) {
       int [] numbers = new int[numbers1.length / 2];
       int index = 0;
        for (int count = 0; count < numbers1.length ; count+=2) {
            numbers[index]= numbers1[count];
            index++;

        }
        System.out.println(Arrays.toString(numbers));
        return numbers;

    }

    public static int[] outputArray3(int...numbers2) {
       int [] numbers = new int[numbers2.length/2];
       int counter =0;
        for (int index = 1; index < numbers2.length; index+=2) {
            numbers[counter] = numbers2[index];
            counter++;

        }
        System.out.println(Arrays.toString(numbers));
        return numbers;

    }

    public static int [] outputArray4(int... numbers) {
       int [] values = new int [numbers.length];
       int sum = 0;
        for (int index = 0; index < values.length ; index++) {
            sum = values[index] ;
        }
        return sum[index];
    }
}
*/
