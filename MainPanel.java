import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    // Arraylists
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<Integer> voteCounts = new ArrayList<>();

    // instance variables
    private int iOSCount;
    private int androidOSCount;
    private int windowsOSCount;
    private int blackberryOSCount;
    private int linuxOSCount;
    //private int otherOSCount;

    private final JButton iOSButton;
    private final JButton androidOSButton;
    private final JButton windowsOSButton;
    private final JButton blackberryOSButton;
    private final JButton linuxOSButton;
    private final JTextField tf1;
    private final JButton otherOSOptionButton;
    private final JButton graphDisplayButton;

    private final JLabel iOSLabel;
    private final JLabel androidOSLabel;
    private final JLabel windowsOSLabel;
    private final JLabel blackberryOSLabel;
    private final JLabel linuxOSLabel;
    private final JLabel pollOtherLabel;


    JPanel votingPanel = new JPanel();
    JPanel labelPanel = new JPanel();
    JPanel createGraphPanel = new JPanel();

    public MainPanel() {

        categories.add(0, "iOS");
        categories.add(1, "Android OS");
        categories.add(2, "Windows OS");
        categories.add(3, "Blackberry OS");
        categories.add(4, "Linux OS");

        voteCounts.add(0, iOSCount);
        voteCounts.add(1, androidOSCount);
        voteCounts.add(2, windowsOSCount);
        voteCounts.add(3, blackberryOSCount);
        voteCounts.add(4, linuxOSCount);

        // initialize count variables to 0
        iOSCount = 0;
        androidOSCount = 0;
        windowsOSCount = 0;
        blackberryOSCount = 0;
        linuxOSCount = 0;

        // initialize buttons/text-field
        iOSButton = new JButton("iOS");
        androidOSButton = new JButton("Android OS");
        windowsOSButton = new JButton("Windows OS");
        blackberryOSButton = new JButton("Blackberry OS");
        linuxOSButton = new JButton("Linux OS");
        tf1 = new JTextField(10);
        tf1.setSize(new Dimension(50, 10));
        otherOSOptionButton = new JButton("Submit Other Option");
        graphDisplayButton = new JButton("Graph Display");

        // action listeners for buttons
        iOSButton.addActionListener(new iOSButtonListener());
        androidOSButton.addActionListener(new AndroidOSButtonListener());
        windowsOSButton.addActionListener(new WindowsOSButtonListener());
        blackberryOSButton.addActionListener(new BlackberryOSButtonListener());
        linuxOSButton.addActionListener(new LinuxOSButtonListener());
        otherOSOptionButton.addActionListener(new OtherOSButtonListener());
        graphDisplayButton.addActionListener(new GraphDisplayButtonListener());

        // create labels
        iOSLabel = new JLabel("iOS Count: " + iOSCount);
        androidOSLabel = new JLabel("AndroidOS Count: " + androidOSCount);
        windowsOSLabel = new JLabel("WindowsOS Count: " + windowsOSCount);
        blackberryOSLabel = new JLabel("Blackberry OS Count: " + blackberryOSCount);
        linuxOSLabel = new JLabel("Linux OS Count: " + linuxOSCount);
        pollOtherLabel = new JLabel();

        add(votingPanel);
        add(labelPanel);
        add(createGraphPanel);


        votingPanel.add(iOSButton);
        votingPanel.add(androidOSButton);
        votingPanel.add(windowsOSButton);
        votingPanel.add(blackberryOSButton);
        votingPanel.add(linuxOSButton);
        votingPanel.add(tf1);
        votingPanel.add(otherOSOptionButton);
        votingPanel.add(graphDisplayButton);


        labelPanel.add(iOSLabel);
        labelPanel.add(androidOSLabel);
        labelPanel.add(windowsOSLabel);
        labelPanel.add(blackberryOSLabel);
        labelPanel.add(linuxOSLabel);
        labelPanel.add(pollOtherLabel);


        createGraphPanel.add(graphDisplayButton);
    }


    private class iOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            iOSCount++;
            iOSLabel.setText("iOS Count: " + iOSCount);
            voteCounts.set(0, iOSCount);
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class AndroidOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            androidOSCount++;
            androidOSLabel.setText("Android OS Count: " + androidOSCount);
            voteCounts.set(1, androidOSCount);
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class WindowsOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            windowsOSCount++;
            windowsOSLabel.setText("Windows OS Count: " + windowsOSCount);
            voteCounts.set(2, windowsOSCount);
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class BlackberryOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            blackberryOSCount++;
            blackberryOSLabel.setText("Blackberry OS Count: " + blackberryOSCount);
            voteCounts.set(3, blackberryOSCount);
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class LinuxOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            linuxOSCount++;
            linuxOSLabel.setText("Linux OS Count: " + linuxOSCount);
            voteCounts.set(4, linuxOSCount);
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class OtherOSButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String textString = tf1.getText();
            if (categories.contains(textString)) {
                int textStringIndexValue = categories.indexOf(textString);
                voteCounts.set(textStringIndexValue, voteCounts.get(textStringIndexValue) + 1);
            }
            else {
                categories.add(textString);
                voteCounts.add(1);
            }
            String str = "";
            for (int i = 5; i < categories.size(); i++) {
                str += categories.get(i) + " Count: " + voteCounts.get(i) + " ";
            }
            pollOtherLabel.setText(str);
            tf1.setText("");
            System.out.println(voteCounts);
            System.out.println(categories);
        }
    }

    private class GraphDisplayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            new StackedChartDisplay().display("Stacked Bar Chart", categories, voteCounts);
            iOSButton.setEnabled(false);
            androidOSButton.setEnabled(false);
            windowsOSButton.setEnabled(false);
            blackberryOSButton.setEnabled(false);
            linuxOSButton.setEnabled(false);
            otherOSOptionButton.setEnabled(false);
        }
    }
}