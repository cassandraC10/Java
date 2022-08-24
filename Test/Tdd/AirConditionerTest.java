package Tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AirConditionerTest {

    @Test
    public void AcCanBeCreated(){
        AirConditioner sandraAc = new AirConditioner();
        assertNotNull(sandraAc);
    }

    @Test
    public void AcCanBeSwitchedOn(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        assertEquals(true, sandraAc.isOn());
    }

    @Test
    void AcCanBeSwitchedOff(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.setSwitch();
        assertFalse(sandraAc.isOn());
    }

    @Test
    void AcTemperatureCanIncrease(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.increaseTemperature();
        assertEquals(17, sandraAc.getTemperature());
    }

    @Test
    void AcTemperatureCannotIncreaseTemperatureWhenItsOff(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.setSwitch();
        sandraAc.increaseTemperature();
        assertEquals(16, sandraAc.getTemperature());
    }

    @Test
    void AcTemperatureCannotExceed30(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        sandraAc.increaseTemperature();
        assertEquals(30, sandraAc.getTemperature());
    }
    @Test
    void AcTemperatureWillNotDecreaseWhenOff(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.decreaseTemperature();
        assertEquals(16, sandraAc.getTemperature());
    }

    @Test
    void AcTemperatureWillNotDecreaseBelow16(){
        AirConditioner sandraAc = new AirConditioner();
        sandraAc.setSwitch();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        sandraAc.decreaseTemperature();
        assertEquals(16, sandraAc.getTemperature());
    }
}


