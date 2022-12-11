package exercise_3;

public class Computer implements Nameable {

    private final String model;

    public Computer(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return "Computer: " + model;
    }
}
