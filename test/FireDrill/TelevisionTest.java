package FireDrill;

import FireDrill.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    private Television television;

    @BeforeEach
    public void initializeTelevision() {
        television = new Television();

    }

    @Test
    public void testThatTelevisionCanBeTurnedOn() {
        assertFalse(television.isOn());
        television.powerOn();
        assertTrue(television.isOn());
    }

    @Test
    public void testThatTelevisionCanBeTurnedOff() {
        television.powerOn();
        assertTrue(television.isOn());
        television.powerOff();
        assertFalse(television.isOn());

    }

    @Test
    public void testThatTelevisionCanAddVolume() {
        television.powerOn();
        //television.powerOff();
        television.increaseVolume();
        television.increaseVolume();
        assertEquals(2, television.getVolume());
    }


    @Test
    public void testThatTelevisionCanDecreaseVolume() {
        television.powerOn();
        television.increaseVolume();
        television.increaseVolume();
        television.decreaseVolume();
        assertEquals(1, television.getVolume());

    }

    @Test
    public void testThatTelevisionCannotDecreaseMoreThanZero(){
        television.powerOn();
        television.decreaseVolume();
        assertEquals(0,television.getVolume());
    }

    @Test
    public void testForChannel(){
        television.powerOn();
        television.changeChannel();
        assertEquals(0,television.getChannel());
    }

}


