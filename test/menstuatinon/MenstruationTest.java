package menstuatinon;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class MenstruationTest {
    @Test
    public void testForUsersName() {
        Menstruation myCalculator = new Menstruation();
        myCalculator.setName("chi-chi");
        assertEquals("chi-chi", myCalculator.getName());
    }

    @Test
    public void testForTheUserAge() {

        Menstruation myCalculator = new Menstruation();

        myCalculator.setAge(21);

        assertEquals(21, myCalculator.getAge());
    }

    @Test
    public void testForParticularMonthYouSawYourPeriod() {

        Menstruation myCalculation = new Menstruation();
        myCalculation.setMonth("December");
        assertEquals("December", myCalculation.getMonth());

    }

    @Test
    public void testForTheDayTheUserSawLastTwoFlows() {
        Menstruation myCalculation = new Menstruation();
        myCalculation.setDay("13");
        assertEquals("13", myCalculation.getDay());

    }

    @Test
    public void testForTheYear() {
        Menstruation myCalculation = new Menstruation();
        myCalculation.setYear("2024");
        assertEquals("2024", myCalculation.getYear());
    }

    @Test
    public void testThatIfWeSetLastMenstrualDate_Its_Return_Accurate() {
        Menstruation myCalculation = new Menstruation();
        myCalculation.setLastMonthMenstrualFlow("2024", "01", "05");
        String actual = String.valueOf(myCalculation.getLastMonthMenstrualFlow());
        assertEquals("2024-01-05",actual);

    }

    @Test
    public void testForTheLastTwoMonthFlow(){
        Menstruation myCalculation = new Menstruation();
        myCalculation.setLastTwoMonthMenstrualFlow("2024","02","06");
        String desired = String.valueOf(myCalculation.getLastTwoMonthMenstrualFlow());
        assertEquals("2024-02-06",desired);
    }
    @Test
    public void testForTheNextMonthFlow(){
        Menstruation myCalculation = new Menstruation();
        String desired = String.valueOf(myCalculation.getNextMenstualFlow(28,"2024","01","01"));
        assertEquals("2024-01-29",desired);
    }
    @Test
    public void testForOvulationPeriod(){
        Menstruation myCalculation = new Menstruation();
        String desired = String.valueOf(myCalculation.getNextMenstualFlow(28,"2024","01","01"));
        assertEquals("2024-01-29",desired);
        String ovulation = String.valueOf(myCalculation.getOvulation());
        assertEquals("2024-01-15",ovulation);
    }
    @Test
    public void testForStartOfSafePeriod(){
        Menstruation myCalculation = new Menstruation();
        String next = String.valueOf(myCalculation.getNextMenstualFlow(28,"2024","01","01"));
        assertEquals("2024-01-29",next);
        String ovulation = String.valueOf(myCalculation.getOvulation());
        assertEquals("2024-01-15",ovulation);
        String safe = String.valueOf(myCalculation.getSafePeriodStart());
        assertEquals("2024-01-06",safe);
    }
    @Test
    public void testForEndOfSafePeriod(){
        Menstruation myCalculation = new Menstruation();
        String next = String.valueOf(myCalculation.getNextMenstualFlow(28,"2024","01","01"));
        assertEquals("2024-01-29",next);
        String ovulation = String.valueOf(myCalculation.getOvulation());
        assertEquals("2024-01-15",ovulation);
        String safeStart = String.valueOf(myCalculation.getSafePeriodStart());
        assertEquals("2024-01-06",safeStart);
        String safeEnd = String.valueOf(myCalculation.getSafePeriodEnds());
        assertEquals("2024-01-11",safeEnd);
    }


}