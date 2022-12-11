package exercise_6_9;

import java.util.ArrayList;

public class Shop implements Printable {

    private ArrayList<Printable> items;

    public Shop() {
        items = new ArrayList<>();
    }

    @Override
    public void print() {
        for( Printable item : items) {
            item.print();
        }
    }

    public void add(Book book) {
        items.add(book);
    }



}
