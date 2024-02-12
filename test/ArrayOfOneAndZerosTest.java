import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfOneAndZerosTest {
    private ArrayOfOneAndZeros myArray;
    @BeforeEach
    public void initializeArrayOfOneAndZeros(){
        myArray = new ArrayOfOneAndZeros();
    }

    @Test
    public void testThatArrayHasReturnNumbersOfOnesAndZeros(){
        int[] sample_input = {4,5,8,8,8,2};
        int [] sample_output ={0,1,0,0,0,0};
        assertArrayEquals(sample_output,myArray.evenAndOddNumbers(sample_input));



    }

}