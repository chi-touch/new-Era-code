package chichi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfTrueAndFalseTest {
    private static ArrayOfTrueAndFalse trueAndFalse;
    @BeforeEach
    public void initializeArrayOfTrueAndFalse(){
        trueAndFalse = new ArrayOfTrueAndFalse();
    }
    @Test
    public void testThatArrayHasTrueAndFalse(){
        int [] sample_input = {4,5,8,8,8,2,9};
        boolean [] output_array = {false,true,false,false,false,false,true};
        assertArrayEquals(output_array,trueAndFalse.evenAndOdd(sample_input));
    }



}