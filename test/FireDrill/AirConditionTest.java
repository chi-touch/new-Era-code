/*
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {


  private AirCondition myAirCondition;
    @BeforeEach
   public void initializeAirCondition(){
        myAirCondition = new AirCondition();

    }

    @Test
    public void testToTurnAirConditionOn() {
     assertFalse(myAirCondition.isOn());
     myAirCondition.powerOn();
     assertTrue(myAirCondition.isOn());
    }

    @Test
    public void testToTurnAirConditionalOff(){
     assertFalse(myAirCondition.isOn());
    myAirCondition.powerOn();
     assertTrue(myAirCondition.isOn());
     myAirCondition.powerOff();
     assertFalse(myAirCondition.isOff());
    }

    @Test
    public void increaseTemperatureFrom16_temperature17Test(){
        myAirCondition.powerOn();
        assertEquals(16,myAirCondition.getTemperature());
        myAirCondition.increaseTemperature();
        assertEquals(17,myAirCondition.getTemperature());

    }

    @Test
    public void decreaseTemperatureFrom18_temperature17(){
        myAirCondition.powerOn();
        assertEquals(17,myAirCondition.getTemperature());
        myAirCondition.decreaseTemperature();
        assertEquals(18,myAirCondition.getTemperature());

    }

    @Test
    public void increaseTemperatureAt30_TemperatureIs30Test(){
        myAirCondition.powerOn();
        assertEquals(16,myAirCondition.getTemperature());
        for (int count = 0; count < 16; count++) {
            myAirCondition.increaseTemperature();

        }
        assertEquals(30,myAirCondition.getTemperature());

    }

    @Test
    public void testToCheckWhenTheTemperatureIsDecreasingBeyondMinimum(){
        myAirCondition.powerOn();
        assertEquals(35,myAirCondition.isOn());
        for (int count = 0; count > 30 ; count++) {
            myAirCondition.decreaseTemperature();

        }



    }
}*/
