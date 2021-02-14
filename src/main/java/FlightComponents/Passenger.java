package FlightComponents;

public class Passenger {

    private String name;
    private int number_of_bags;

    public Passenger(String name, int number_of_bags){
        this.name = name;
        this.number_of_bags = number_of_bags;
    }

    public String getName() {
        return name;
    }

    public int getNumber_of_bags() {
        return number_of_bags;
    }

    public void setNumber_of_bags(int number_of_bags) {
        this.number_of_bags = number_of_bags;
    }
}
