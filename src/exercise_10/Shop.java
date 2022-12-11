package exercise_10;



import java.util.ArrayList;

public class Shop {

    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return computers.toString();
    }

    public void addComputer() {
        Computer comp = new Computer();
        comp.input();
        computers.add(comp);
    }

    public void delComputer(String model) {
        computers.removeIf(computer -> (computer.getModel().equals(model)));
    }

    public Computer find(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equals(model)) {
                return computer;
            }
        }
        return null;
    }
}
