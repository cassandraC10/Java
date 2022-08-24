package Tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class TelevisionTest {
    @Test
    void TelevisionCanBeCreated() {
        Television sandraTv = new Television();
        assertNotNull(sandraTv);
    }

    @Test
    void TelevisionCanTurnOn() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        assertEquals(true, sandraTv.isOn());
    }

    @Test
    void TelevisionCanBeTurnedOff() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.switchOff();
        assertEquals(true, sandraTv.isOn());
    }

    @Test
    void SwitchingChannel() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.changeChannel(25);
        assertEquals(25, sandraTv.getChannel());
    }

    @Test
    void ChangeChannelForward() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseChannel();
        assertEquals(1, sandraTv.getChannel());
    }

    @Test
    void ChangeChannelBackward() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseChannel();
        sandraTv.decreaseChanel();
        assertEquals(0, sandraTv.getChannel());
    }

    @Test
    void IncreaseTvVolume() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseVolume();
        assertEquals(1, sandraTv.getVolume());
    }

    @Test
    void DecreaseTvVolume() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.decreaseVolume();
        assertEquals(1, sandraTv.getVolume());
    }

    @Test
    void limitTheHighestChannelTo40() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        sandraTv.increaseChannel();
        assertEquals(40, sandraTv.getChannel());
    }

    @Test
    void channelCannotGoBelow0() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseChannel();
        sandraTv.decreaseChanel();
        sandraTv.decreaseChanel();
        assertEquals(0, sandraTv.getChannel());
    }

    @Test
    void volumeCannotGoBelowLimit() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.decreaseVolume();
        sandraTv.decreaseVolume();
        sandraTv.decreaseVolume();
        assertEquals(0, sandraTv.getVolume());
    }

    @Test
    void volumeCannotGoAboveLimit() {
        Television sandraTv = new Television();
        sandraTv.switchOn();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        sandraTv.increaseVolume();
        assertEquals(40, sandraTv.getVolume());

    }
}

