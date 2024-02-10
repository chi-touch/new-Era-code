package FireDrill;

public class TaskFive5 {

    public static void main(String[] args) {
        double result = 0;

        for (int number = 1; number <=10 ; number++) {
            for (int count = 1; count <=5; count ++) {

                    if(number % 4 == 0) {

                        System.out.printf("%d ", number);
                    }
            }
        }
    }
}