package exercise_11;

public class Converter implements Convertable {

    @Override
    public double convertToKelvin(double number) {
        return number + 270;
    }

    @Override
    public double convertToFahrenheit(double number) {
        return number * 1.8 + 32;
    }
}
