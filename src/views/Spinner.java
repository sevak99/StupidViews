package views;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class Spinner extends View {
    private boolean isOpened;
    private String[] spinnerItems = {"one", "two", "three"};

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;

        System.out.println(toString());
    }

    @Override
    public String toString() {
        if(!isOpened) {
            return "Spinner is Closed";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Spinner is Opened:").append("\n");

        for(String item : spinnerItems) {
            stringBuilder.append(item).append("\n");
        }
        return stringBuilder.toString();
    }
}
