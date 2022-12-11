package exercise_10;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int count = getNumber("Введите количество предметов, которые хотите добавить в магазин: ");
        Shop shop = new Shop();
        for (int i = 0; i < count; i++) {
            shop.addComputer();
        }
        System.out.println(shop.find("ProDesk"));
        System.out.println(shop);


    }

    public static int getNumber(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        int number = scanner.nextInt();
        return number;
    }
}
