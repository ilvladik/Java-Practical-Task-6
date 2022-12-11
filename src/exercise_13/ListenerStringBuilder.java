package exercise_13;

public class ListenerStringBuilder implements OnChangeListener {

    @Override
    public void onChange(ObserverStringBuilder stringBuilder) {
        System.out.println("changed: " + stringBuilder.toString());
    }
}
