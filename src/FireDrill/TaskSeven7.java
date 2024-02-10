package FireDrill;

public class TaskSeven7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <=10 ; number++) {
            for (int count = 1; count <=5; count ++) {

                if(number % 4 == 0) {

                    sum += (int) Math.pow(number,count);
                }
            }

            if (number % 4 == 0) {
                System.out.print(sum + " ");
                sum = 0;
            }
        }
    }
}
