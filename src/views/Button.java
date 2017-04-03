package views;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class Button extends View {
    private String title;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
