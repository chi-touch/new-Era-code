
package FireDrill;

import FireDrill.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BikeTest {

    private Bike myBike;
    @BeforeEach
    public void initializeBike(){

        myBike = new Bike();
    }

    @Test
    public void testThatTheBikeCanPowerOn(){
        assertFalse(myBike.isTurnOff());
        myBike.powerOn();
        assertTrue(myBike.isTurnOn());

    }

    @Test
    public void testThatTheBikeCanPowerOff(){
        assertFalse(myBike.isTurnOn());
        myBike.powerOn();
        assertTrue(myBike.isTurnOn());
        assertFalse(myBike.isTurnOff());
    }



    @Test
    public void testThatBikeCanChangeGear(){
        myBike.powerOn();
        for (int counter = 1; counter <=20 ; counter++) {
            myBike.accelerate();
        }
        assertEquals(1,myBike.getGear());
        assertEquals(20,myBike.getSpeed());
    }

    @Test
    public void  testThatBikeCanChangeGearTwice(){
        myBike.powerOn();
        for (int count = 1; count <=21 ; count++) {
            myBike.accelerate();
        }
        assertEquals(2,myBike.getGear());
        assertEquals(21,myBike.getSpeed());

        for (int count = 1; count <= 5 ; count++) {
            myBike.accelerate();
        }
        assertEquals(3,myBike.getGear());
        assertEquals(31,myBike.getSpeed());

        for (int count = 1; count <= 4 ; count++) {
            myBike.accelerate();
        }
        assertEquals(4,myBike.getGear());
        assertEquals(43,myBike.getSpeed());


    }




    @Test
    public void testThatBikeCanDecelerateMoreThanOnce(){
        myBike.powerOn();
        for (int index = 21; index >=1 ; index--) {
            myBike.accelerate();

        }
        assertEquals(2,myBike.getGear());
        assertEquals(21,myBike.getSpeed());

        myBike.decelerate();

        assertEquals(1,myBike.getGear());
        assertEquals(19,myBike.getSpeed());

    }

}
