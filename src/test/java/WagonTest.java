import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WagonTest {
    Wagon w;

    @Before
    public void setUp() throws Exception {
        w = new Wagon();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, w.getMaxSpeed());
    }

}
