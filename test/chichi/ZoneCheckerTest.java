package chichi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chichi.GeoPoliticalZone.*;
import static org.junit.jupiter.api.Assertions.*;

class ZoneCheckerTest {

    private ZoneChecker zone;

    @BeforeEach
    public void initializeZone(){

         zone = new ZoneChecker();
    }

    @Test
    public void testForSouth_WestZonesStates(){
        GeoPoliticalZone checker = zone.checkZone("Lagos");
        System.out.println(zone.checkZone("Lagos"));
        assertEquals(SOUTH_WEST, checker);
    }

    @Test
    public void testForSouth_EastState(){
        System.out.println(zone.checkZone("Imo"));
        assertEquals(SOUTH_EAST,zone.checkZone("Imo"));
    }

    @Test
    public void testForSouth_SouthState(){
        System.out.println(zone.checkZone("Edo"));
        assertEquals(SOUTH_SOUTH,zone.checkZone("Edo"));
    }

    @Test
    public void testForNorth_EastState(){
        System.out.println(zone.checkZone("Adamawa"));
        assertEquals(NORTH_EAST,zone.checkZone("Adamawa"));
    }

    @Test
    public void testForNorth_WestState(){
        System.out.println(zone.checkZone("Kaduna"));
        assertEquals(NORTH_WEST,zone.checkZone("Kaduna"));
    }

    @Test
    public void testForNorth_CentralState(){
        System.out.println(zone.checkZone("Benue"));
        assertEquals(NORTH_CENTRAL,zone.checkZone("Benue"));


    }

    @Test
    public void testForNorth_CentralAndNorth_EastState(){
        System.out.println(zone.checkZone("Benue"));
        System.out.println(zone.checkZone("Bauchi"));
        assertEquals(NORTH_CENTRAL,zone.checkZone("Benue"));
        assertEquals(NORTH_EAST,zone.checkZone("Bauchi"));
    }










}