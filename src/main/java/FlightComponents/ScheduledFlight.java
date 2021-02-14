package FlightComponents;

public enum ScheduledFlight {
    JVA121("EDI", "CCS", "16:45"),
    JVA122("CCS", "EDI", "12:15"),
    JVA344("EDI", "CGK", "22:49"),
    JVA345("CGK", "EDI", "8:50");

    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;

    ScheduledFlight(String departureAirport, String arrivalAirport, String departureTime){
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
    }

    public String getDepAirport() {
        return departureAirport;
    }

    public String getArrAirport() {
        return arrivalAirport;
    }

    public String getDepTime() {
        return departureTime;
    }
}
