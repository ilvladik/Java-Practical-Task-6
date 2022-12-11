package exercise_11;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        double number = getNumber("Введите температуру в цельсиях: ");
        if (number < -270) {
            System.out.println("Самая низкая температура -270 С");
            return;
        }
        Converter conv = new Converter();
        System.out.println(conv.convertToKelvin(number) + " K " + conv.convertToFahrenheit(number) + " F");
    }

    public static double getNumber(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        double number = scanner.nextDouble();
        return number;
    }

}
