package FireDrill;

public class TaskEigth {

    public static void main(String[] args) {
        int sum = 0;
        int result = 0;
        for (int number = 1; number <=10 ; number++) {
            for (int count = 1; count <= 5; count++) {

                if (number % 4 == 0) {

                    sum += (int) Math.pow(number, count);
                    result = sum *sum;
                }
            }

        }
        System.out.print(result);
    }
}
