package views;

import java.util.Scanner;

/**
 * Created by СЕВАК on 02.04.2017.
 */
public class TestStupidViews {

    private int counter;
    private boolean canExitProgram;
    private ViewGroup viewGroup;

    public TestStupidViews() {
        viewGroup = new ViewGroup();

        Button button1 = new Button("Button One");
        Button button2 = new Button("Button Two");
        CheckBox checkBox1 = new CheckBox("Check Box One");
        CheckBox checkBox2 = new CheckBox("Check Box Two");
        Spinner spinner = new Spinner();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onclick(View view) {
                System.out.println("Clicked: " + button1.getTitle());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onclick(View view) {
                counter++;
                System.out.println("Clicked: " + button2.getTitle() + ", counter: " + counter);
            }
        });

        checkBox1.setOnClickListener(new CheckBoxClickListener());
        checkBox2.setOnClickListener(new CheckBoxClickListener());

        checkBox2.setOnCheckChangeListener(new CheckBox.OnCheckChangeListener() {
            @Override
            public void onCheckChanged(View view, boolean isChecked) {
                canExitProgram = isChecked;
            }
        });

//        checkBox1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onclick(View view) {
//                checkBox1.setChecked(!checkBox1.isChecked());
//                System.out.println("Is Checked: " + checkBox1.isChecked());
//            }
//        });
//
//        checkBox2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onclick(View view) {
//                checkBox2.setChecked(!checkBox2.isChecked());
//                System.out.println("Is Checked: " + checkBox2.isChecked());
//                canExit = checkBox2.isChecked();
//            }
//        });

        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onclick(View view) {
                spinner.setOpened(!spinner.isOpened());
            }
        });

        viewGroup.addView(button1);
        viewGroup.addView(button2);
        viewGroup.addView(checkBox1);
        viewGroup.addView(checkBox2);
        viewGroup.addView(spinner);
    }

    private class CheckBoxClickListener implements View.OnClickListener {

        @Override
        public void onclick(View view) {
            ((CheckBox) view).setChecked(!((CheckBox) view).isChecked());
            System.out.println("Is Checked: " + ((CheckBox) view).isChecked());
        }
    }

    public void init() {
        while (counter < 4 || !canExitProgram) {
            System.out.print("Enter: ");
            Scanner scanner  = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a == 0) {
                viewGroup.draw();
                continue;
            }
            viewGroup.getView(a - 1).performClick();
        }
    }
}
