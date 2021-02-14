package FlightComponents;

public enum Aircraft {
    A320(186, 6150),
    A321NEO(235, 7000);

    private final int capacity;
    private final int range_km;

    Aircraft(int capacity, int range_km){
        this.capacity = capacity;
        this.range_km = range_km;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange_km() {
        return range_km;
    }
}
