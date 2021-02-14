import FlightComponents.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Juan", 0);
    }

    @Test
    public void hasName(){
        assertEquals("Juan", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(0, passenger.getNumber_of_bags());
    }

    @Test
    public void modifyNumberOfBags(){
        passenger.setNumber_of_bags(1);
        assertEquals(1, passenger.getNumber_of_bags());
    }
}
