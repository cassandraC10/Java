package Tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class BikeTest {
    @Test
    public void bikeCanBeCreated() {
        Bike sandraBike = new Bike();
        assertNotNull(sandraBike);
    }

    @Test
    public void isOn() {
        Bike sandraBike = new Bike();
        sandraBike.setSwitch();
        assertEquals(true, sandraBike.isOn());
    }

    @Test
    public void bikeCanBeAccelerated() {
        Bike sandraBike = new Bike();
        sandraBike.setSwitch();
        sandraBike.accelerate();
        assertEquals(1, sandraBike.getSpeed());
    }

    @Test
    public void bikeCanBeChangedToGearOne() {
        Bike sandraBike = new Bike();
        sandraBike.setSwitch();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        assertEquals(16, sandraBike.getSpeed());
    }
    @Test
    public void bikeCanChangeToGear2() {
        Bike sandraBike = new Bike();
        sandraBike.setSwitch();
        sandraBike.Gear();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//      sandraBike.Gear();
        assertEquals(1, sandraBike.getGear());
        assertEquals(26, sandraBike.getSpeed());
    }
//
    @Test
    public void bikeCanChangeToGear3() {
        Bike sandrBike = new Bike();
        sandrBike.setSwitch();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.accelerate();
        sandrBike.Gear();
        assertEquals(38, sandrBike.getSpeed());
    }

    @Test
    public void bikeCanChangeToGear4() {
        Bike sandraBike = new Bike();
        sandraBike.setSwitch();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        sandraBike.accelerate();
        assertEquals(48, sandraBike.getSpeed());
    }
    }
