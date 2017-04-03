package views;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class CheckBox extends View {
    private boolean isChecked;
    private  String name;
    private OnCheckChangeListener onCheckChangeListener;

    public CheckBox(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;

        if(onCheckChangeListener != null)
            onCheckChangeListener.onCheckChanged(this, isChecked);
    }

    public void setOnCheckChangeListener(OnCheckChangeListener onCheckChangeListener) {
        this.onCheckChangeListener = onCheckChangeListener;
    }

    @Override
    public String toString() {
        return String.format("Check Box: " + name + ", is checked: " + isChecked);
    }

    public interface OnCheckChangeListener {
        void onCheckChanged(View view, boolean isChecked);
    }
}
