package section10_reflection.model;

public class Goat extends Animal implements Locomotion {

    private String colour;
    public static final int NO_OF_LEGS = 4;

    public Goat(String name, String colour) {
        super(name);
        this.colour = colour;
    }

    public Goat(String name) {
        super(name);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    protected String getSound() {
        return "bleat";
    }

    @Override
    public String getLocomotion() {
        return "walks";
    }

    @Override
    public String eats() {
        return "grass";
    }

    @Override
    public String toString() {
        return "Goat{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
