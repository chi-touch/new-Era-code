package Tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private Task1 task1;
    @BeforeEach
    public  void initializeTask1(){
         task1 = new Task1();
    }

   /* @Test
    public void testForCurrentDay(){
        int value =Task1.getAge("22/11/2022");
        assertEquals(1,value);
    }*/

    @Test
    public void testForCurrentDay(){
        int value = Task1.getAge("22/11/2022");
        assertEquals(1,value);
        System.out.println(value);
    }

}