package exercise_3;

public class Tester {

    public static void main(String[] args) {
        Human john = new Human("John");
        Computer desktop = new Computer("desktop PC");

        System.out.println(john.getName());
        System.out.println(desktop.getName());
    }
}
