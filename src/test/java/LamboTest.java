import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class LamboTest {
        Lambo l;

        @Before
        public void setUp() throws Exception {
            l = new Lambo();
        }

        @Test(timeout = 50)
        public void TestGetMaxSpeed() {
            assertEquals(350, l.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestUpgradeSpeed() {
            l.upgradeSpeed();
            assertEquals(351, l.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestDowngradeSpeed() {
            l.downgradeSpeed();
            assertEquals(349, l.getMaxSpeed());
        }

        @Test(timeout = 50)
        public void TestGetPrice() {
            assertEquals(400000, l.getPrice());
        }
}
