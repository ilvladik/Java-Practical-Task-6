package exercise_12;

public class Tester {

    public static void main(String[] args) {
        UndoStringBuilder stringBuilder = new UndoStringBuilder();
        stringBuilder.append("Hello World!");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
    }
}
