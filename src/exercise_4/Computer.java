package exercise_4;

public class Computer implements Priceable {

    private final double price;

    public Computer(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
