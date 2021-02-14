import Crew.CabinCrew;
import Crew.Pilot;
import FlightComponents.Aircraft;
import FlightComponents.Passenger;
import FlightComponents.ScheduledFlight;

import java.util.ArrayList;

public class Flight {

    private ScheduledFlight scheduledFlight;
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Aircraft aircraft;

    public Flight(ScheduledFlight scheduledFlight, Pilot pilot, ArrayList<CabinCrew> cabinCrewMembers, Aircraft aircraft){
        this.scheduledFlight = scheduledFlight;
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.aircraft = aircraft;
        this.passengers = new ArrayList<Passenger>();
    }

    public String getDestination(){
        return scheduledFlight.getArrAirport();
    }

    public String getOriginAirport(){
        return scheduledFlight.getDepAirport();
    }

    public String getDepartureTime(){
        return scheduledFlight.getDepTime();
    }

    public String getPilotName() {
        return pilot.getName();
    }

    public String getPilotLicense(){
        return pilot.getLicense();
    }

    public ArrayList<CabinCrew> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumberOfPassengers(){
        return passengers.size();
    }

    public String getAircraft(){
        return aircraft.name();
    }

    public int getAircraftCapacity(){
        return aircraft.getCapacity();
    }

    public void checkInPassenger(Passenger passenger){
        if (this.getNumberOfPassengers() < this.aircraft.getCapacity()){
        passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return getAircraftCapacity() - passengers.size();
    }




    }
