package exercise_1;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        MovableCircle circle = getCircle();
        System.out.println(circle);

        circle.moveDown();
        circle.moveLeft();

        System.out.println(circle);
    }

    public static int getNumber(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        return scanner.nextInt();
    }

    public static MovableCircle getCircle() {

        int x = getNumber("Введите координату x центра: ");
        int xSpeed = getNumber("Введите скорость по x: ");
        int y = getNumber("Введите координату y центра: ");
        int ySpeed = getNumber("Введите скорость по y: ");
        int radius = getNumber("Введите радиус окружности: ");

        return new MovableCircle(x, y, xSpeed, ySpeed, radius);
    }
}
