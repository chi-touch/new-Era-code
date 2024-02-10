package FireDrill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void test_that_the_function_below_will_take_10_values_and_return_highest_and_lowest(){
       int[] numbers = {2,4,6,8,10,12,300,40,45,37};
       String actual = "300,2";
        String expect = HighestAndLowest.highestAndLowest(numbers);
        assertEquals(actual,expect);
    }


}
