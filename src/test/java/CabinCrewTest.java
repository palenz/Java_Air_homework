import Crew.CabinCrew;
import Crew.Rank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CabinCrewTest {

    CabinCrew flightAttendant;

    @Before
    public void before(){
        flightAttendant = new CabinCrew("Laura", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Laura", flightAttendant.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("FLIGHT_ATTENDANT", flightAttendant.getRank());
    }

    @Test
    public void CanRelayMessage(){
        assertEquals("We are about to land", flightAttendant.relayMessage("We are about to land"));
    }

}
