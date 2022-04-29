import java.awt.*;
import javax.swing.*;

public class PollTracking {

    public static void main(String[] args) {
        JFrame pollFrame = new JFrame("Choose your favorite mobile operating system");
        pollFrame.setPreferredSize(new Dimension(1000, 300));
        pollFrame.add(new MainPanel());
        pollFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pollFrame.setResizable(false);
        pollFrame.pack();
        pollFrame.setVisible(true);
    }
}