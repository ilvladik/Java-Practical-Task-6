package exercise_3;

public class Human implements Nameable {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Human: " + name;
    }
}
