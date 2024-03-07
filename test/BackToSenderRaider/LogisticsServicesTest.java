package BackToSenderRaider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogisticsServicesTest {
    private LogisticsServices service;

    @BeforeEach
    public void initializeLogisticsServices(){
        service = new LogisticsServices();
    }

    @Test
    public void testToCalculateFirstRiderPayment(){
        assertEquals(45000,service.riderWageForTheDay(80));
    }
    @Test
    public void testToCalculateSecondRiderPayment(){
        assertEquals(9000,service.riderWageForTheDay(25));
    }
    @Test
    public void testForErrors(){
        assertThrows(IllegalArgumentException.class,()-> service.riderWageForTheDay(150));
    }

}