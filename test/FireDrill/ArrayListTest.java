
package FireDrill;

import FireDrill.FireDrill5.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    private ArrayList strings;
    @BeforeEach
    public void initializeArrayList(){
        strings = new ArrayList();
    }

    @Test
    public void newArrayListIsEmpty(){
        assertTrue(strings.isEmpty());
    }

    @Test
    public void testThatNewElementIsAddedToTheList(){
        assertTrue(strings.isEmpty());
        strings.add("G-String");
        assertFalse(strings.isEmpty());

    }




}
