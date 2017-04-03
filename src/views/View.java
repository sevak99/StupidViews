package views;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class View {
    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void performClick() {
        onClickListener.onclick(this);
    }

    public interface OnClickListener {
        void onclick(View view);
    }
}
