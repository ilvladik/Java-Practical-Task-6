package exercise_6_9;

public class Book implements Printable {

    private String title;
    private String author;
    private int date;

    public Book(String title, String author, int date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Book ("
                    + " title = " + title
                    + ", author = " + author
                    + ", date = " + date + " )");
    }

}
