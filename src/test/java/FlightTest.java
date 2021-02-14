import Crew.CabinCrew;
import Crew.Pilot;
import Crew.Rank;
import FlightComponents.Aircraft;
import FlightComponents.Passenger;
import FlightComponents.ScheduledFlight;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Pilot pilot;
    ArrayList<CabinCrew> cabinCrewMembers;
    CabinCrew flightAttendant;
    CabinCrew firstOfficer;

    @Before

    public void before(){

        pilot = new Pilot("Juan", "J2FK1");

        firstOfficer = new CabinCrew("Joseph", Rank.FIRST_OFFICER);
        flightAttendant = new CabinCrew("Laura", Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrew> cabinCrewMembers = new ArrayList<CabinCrew>();

        cabinCrewMembers.add(firstOfficer);
        cabinCrewMembers.add(flightAttendant);

        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        Passenger passenger1 = new Passenger ("Joey", 1);
        passengerList.add(passenger1);

//      Note how the flight pre made enum is already passed. This contains the flight info:
        flight = new Flight(ScheduledFlight.JVA121, pilot, cabinCrewMembers, Aircraft.A320);

    }

    @Test
    public void CanGetPilotFullName(){
        assertEquals("Juan", flight.getPilotName());
    }

    @Test
    public void CangetPilotLicense(){
        assertEquals("J2FK1", flight.getPilotLicense());
    }

    @Test
    public void CangetCabinCrewMembers(){
        ArrayList<CabinCrew> testCrew = new ArrayList<CabinCrew>();
        testCrew.add(firstOfficer);
        testCrew.add(flightAttendant);
        assertEquals(testCrew, flight.getCabinCrewMembers());
    }

    @Test
    public void CangetDepartureTime(){
        assertEquals("16:45", flight.getDepartureTime());
    }

    @Test
    public void CangetDepartureAirport(){
        assertEquals("EDI", flight.getOriginAirport());
    }

    @Test
    public void CanGetDestination(){
        assertEquals("CCS", flight.getDestination());
    }

    @Test
    public void CanGetAircraft(){
        assertEquals("A320", flight.getAircraft());
    }

    @Test
    public void CanGetAircraftCapacity(){
        assertEquals(186, flight.getAircraftCapacity());
    }


    @Test
    public void CanGetListOfPassenger(){
        ArrayList<Passenger> passengerTestList = new ArrayList<Passenger>();
        Passenger passenger1 = new Passenger ("Joey", 1);
        passengerTestList.add(passenger1);

        flight.checkInPassenger(passenger1);
        assertEquals(passengerTestList, flight.getPassengers());
    }

    @Test
    public void CanGetNumberOfPassengers(){
        Passenger passenger1 = new Passenger ("Joey", 1);
        flight.checkInPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void CanGetAvailableSeats(){
        Passenger passenger1 = new Passenger ("Joey", 1);
        Passenger passenger2 = new Passenger ("Lucia", 2);
        flight.checkInPassenger(passenger1);
        flight.checkInPassenger(passenger2);

        assertEquals(184, flight.getAvailableSeats());
    }

    @Test
    public void FullPlane(){
        Passenger passenger1 = new Passenger ("Joey", 1);
        for(int i = 0; i < 200; ++i){
            flight.checkInPassenger(passenger1);
        }

        assertEquals(186, flight.getNumberOfPassengers());
    }


}
