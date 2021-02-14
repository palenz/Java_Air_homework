import Crew.Pilot;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Juan", "J2FK1");
    }

    @Test
    public void hasName(){
        assertEquals ("Juan", pilot.getName());
    }

    @Test
    public void hasLicense(){
        assertEquals("J2FK1", pilot.getLicense());
    }

    @Test
    public void CanFlyPlane(){
        assertEquals("Hello this is Captain Juan speaking...", pilot.flyPlane());
    }



}
