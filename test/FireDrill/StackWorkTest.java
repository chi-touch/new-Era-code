package FireDrill;

import FireDrill.StackWork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWorkTest {

    private StackWork myStackWork;
    @BeforeEach
    public void initializeStackWork(){
        myStackWork = new StackWork(3);
    }

    @Test
    public void testThatStackIsEmpty(){
        assertTrue(myStackWork.isEmpty());
    }

    @Test
    public void add_testThatStackCanAdd(){
        assertTrue(myStackWork.isEmpty());
        myStackWork.push("chichi");
        assertTrue(myStackWork.isEmpty());
    }

    @Test
    public void add_testThatStackCanMore(){
        assertTrue(myStackWork.isEmpty());
        myStackWork.push("chichi");
        myStackWork.push("oluebube");
        assertFalse(myStackWork.isEmpty());

    }

    @Test
    public void testThatStackCanRemoveFromTopStackWork(){
       assertTrue(myStackWork.isEmpty());
        myStackWork.push("chichi");
        myStackWork.push("me");
        myStackWork.push("them");
        myStackWork.pop();

        assertFalse(myStackWork.isEmpty());
    }

}