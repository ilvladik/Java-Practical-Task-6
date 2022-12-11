package exercise_13;

public class Tester {

    public static void main(String[] args) {

        ObserverStringBuilder observerStringBuilder = new ObserverStringBuilder();
        observerStringBuilder.setOnChangeListener(new ListenerStringBuilder());
        observerStringBuilder.append("Hello");
        observerStringBuilder.append(" World!");
    }
}
