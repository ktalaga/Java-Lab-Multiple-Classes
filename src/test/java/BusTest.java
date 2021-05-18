import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 4);
    }

    @Test
    public void canCountPassengers(){
        assertEquals(0, bus.getPassengersCount());
    }




}