package Crew;

public class CabinCrew {

    private String name;
    private Rank rank;

    public CabinCrew(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank.name();
    }

    public String relayMessage(String message){
        return message;
    }

}
