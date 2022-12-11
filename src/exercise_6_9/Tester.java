package exercise_6_9;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int count = getNumber("Введите количество предметов, которые хотите добавить в магазин: ");
        Shop shop = new Shop();
        for (int i = 0; i < count; i++) {
            Book book = getBook();
            shop.add(book);
        }
        shop.print();
    }

    public static Book getBook() {
        System.out.println("Новая книга");
        String title = getLine("Введите название книги: ");
        String author = getLine( "Введите автора книги:  ");
        int date = Integer.parseInt(getLine("Введите дату создания: "));

        return new Book(title, author, date);
    }

    public static String getLine(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        String line = scanner.nextLine();
        return line;
    }

    public static int getNumber(String interaction) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(interaction);
        int number = scanner.nextInt();
        return number;
    }
}
