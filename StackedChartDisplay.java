import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StackedChartDisplay {

    public void display(String title, ArrayList<String> categories, ArrayList<Integer> votes) {
        JFrame f1 = new JFrame();
        f1.setPreferredSize(new Dimension(700, 700));
        f1.setResizable(false);
        f1.setTitle(title);
        f1.add(new StackedChartComponent(categories, votes));
        f1.pack();
        f1.setVisible(true);
    }
}