
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
        strings.add("Chichi");
        assertFalse(strings.isEmpty());

    }

    @Test
    public void addNewElementAndRemoveElement(){
        assertTrue(strings.isEmpty());
        strings.add("Chichi");

        strings.remove("Chichi");
        assertTrue(strings.isEmpty());
    }

    @Test
    public void testThatTwoElementCanBeAddedAndOneIsRemoved(){
        assertTrue(strings.isEmpty());
        strings.add("chichi");
        strings.add("oluebube");
        assertFalse(strings.isEmpty());
        strings.remove("chichi");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void testThatElementCanBeRemovedFromList(){
        assertTrue(strings.isEmpty());
        strings.add("chichi");
        strings.add("oluebube");
        strings.add("chime");
        assertThrows(ArrayIndexOutOfBoundsException.class,()->strings.remove("chichi"));
    }

    @Test
    public void testThatElementCanBeGottenFromTheIndex(){
        assertTrue(strings.isEmpty());
        strings.add("chichi");
        strings.add("oluchi");
        strings.add("chime");
        strings.add("me");
        strings.add("them");
        assertFalse(strings.isEmpty());
        assertEquals("chichi",strings.get("0