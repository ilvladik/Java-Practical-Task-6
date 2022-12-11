package exercise_2;

import exercise_1.MovablePoint;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        MovableRectangle rectangle = getRectangle();
        System.out.println(rectangle);

        rectangle.moveDown();
        rectangle.moveLeft();

        System.out.println(rectangle);
    }

    public static int getNumber(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        return scanner.nextInt();
    }

    public static MovablePoint getPoint(String interaction) {

        System.out.println(interaction);
        int x = getNumber("Введите координату x: ");
        int xSpeed = getNumber("Введите скорость по x: ");
        int y = getNumber("Введите координату y: ");
        int ySpeed = getNumber("Введите скорость по y: ");
        System.out.println();
        return new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public static MovableRectangle getRectangle() {

        MovablePoint pointTop = getPoint("Создание первой точки");
        MovablePoint pointBottom = getPoint("Создание второй точки");

        return new MovableRectangle(pointTop, pointBottom);
    }
}
