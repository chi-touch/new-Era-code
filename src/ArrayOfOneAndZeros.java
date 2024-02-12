public class ArrayOfOneAndZeros {

    public int[] evenAndOddNumbers(int[] numbers) {

        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = numbers[count]%2;
        }
        return numbers;
    }
}
