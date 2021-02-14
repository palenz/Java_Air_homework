package Crew;

public class Pilot {

    private String license;
    private String name;

    public Pilot(String name, String license) {
        this.name = name;
        this.license = license;

    }

    public String getLicense() {
        return license;
    }

    public String getName() {
        return name;
    }

    public String flyPlane(){
        return String.format("Hello this is Captain %s speaking...", name);
    }

}
