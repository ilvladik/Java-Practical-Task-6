package exercise_13;

public class ObserverStringBuilder {

    private OnChangeListener onChangeListener;

    private StringBuilder stringBuilder;

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public ObserverStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public void setOnChangeListener(OnChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    private void notifyOnStringBuilderChangeListener() {
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }

    public ObserverStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }


}
