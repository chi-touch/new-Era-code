package minmax;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    @Test
    public void testMinMax(){
        int [] numbers = {3,4,5,2,1};
        System.out.println(Arrays.toString(MinMax.minMax(numbers)));
        assertArrayEquals(new int[]{10,14},MinMax.minMax(numbers));
    }

}