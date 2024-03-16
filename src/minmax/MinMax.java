package minmax;

import java.util.Arrays;

public class MinMax {

    public static int[]minMax(int[]numbers){
        return new int []{Arrays.stream(numbers).sum()-Arrays.stream(numbers).max().getAsInt(),Arrays.stream(numbers).sum()-Arrays.stream(numbers).min().getAsInt()};
    }




}
