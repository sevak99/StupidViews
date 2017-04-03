package views;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class ViewGroup {
    private List<View> list;

    public ViewGroup() {
        list = new ArrayList<>();
    }

    public void addView(View v) {
        list.add(v);
    }
    public View getView(int i) {
        return list.get(i);
    }

    public void draw() {
        for(View view : list) {
            System.out.println(view.toString());
        }
    }
}
