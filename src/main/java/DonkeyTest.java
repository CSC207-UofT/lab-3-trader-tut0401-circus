import org.junit.Before;
import org.junit.Test;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DonkeyTest {

    Donkey d;

    @Before
    public void setUp() throws Exception {
        d = new Donkey(1, 15, 100);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("mooooo!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(15, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(2, d.getSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(0, d.getSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, d.getPrice());
    }

}

