package exercise_12;

import java.util.Stack;

public class UndoStringBuilder {

    private StringBuilder stringBuilder;

    private Stack<Action> actions = new Stack<>();

    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public UndoStringBuilder reverse() {
        stringBuilder.reverse();

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.reverse();
            }
        };
        actions.add(action);

        return this;
    }

    public UndoStringBuilder append(String str) {
        stringBuilder.append(str);

        Action action = new Action() {
            @Override
            public void undo() {
                stringBuilder.delete(stringBuilder.length() - str.length(), stringBuilder.length());
            }
        };

        actions.add(action);
        return this;
    }

    public void undo(){
        if(!actions.isEmpty()){
            actions.pop().undo();
        }
    }

    private interface Action {
        void undo();
    }
}
