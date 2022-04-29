import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.ArrayList;

public class StackedChartComponent extends JComponent {

    public StackedChartComponent(ArrayList<String> c, ArrayList<Integer> v) {

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);

        g.drawString("Favorite Operating System Poll", 60, 20);

        g.drawString("100%", 16, 50);
        g.drawLine(50, 45, 650, 45);

        g.drawString(" 75%", 20, 160);
        g.drawLine(50, 155, 650, 155);

        g.drawString(" 50%", 20, 270);
        g.drawLine(50, 265, 650, 265);

        g.drawString(" 25%", 20, 380);
        g.drawLine(50, 375, 650, 375);

        g.drawString("  0%", 24, 490);
        g.drawLine(50, 485, 650, 485);

        g.drawString("Operating Systems", 280, 500);

        if (MainPanel.voteCounts.size() == 5) {
            // Legend
            // iOS
            g.setColor(Color.red);
            g.fillRect(230, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("IOS", 252, 520);

            // Android OS
            g.setColor(Color.blue);
            g.fillRect(280, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("Android OS", 302, 520);

            // Windows OS
            g.setColor(Color.green);
            g.fillRect(382, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("Windows OS", 405, 520);

            // Blackberry
            g.setColor(Color.yellow);
            g.fillRect(205, 530, 20, 10);
            g.setColor(Color.black);
            g.drawString("Blackberry OS", 227, 540);

            // Linux
            g.setColor(Color.orange);
            g.fillRect(321, 530, 20, 10);
            g.setColor(Color.black);
            g.drawString("Linux OS", 345, 540);

            double sumOfUpToFirstSixIndexes = MainPanel.voteCounts.get(0) + MainPanel.voteCounts.get(1) + MainPanel.voteCounts.get(2) + MainPanel.voteCounts.get(3) + MainPanel.voteCounts.get(4);

            double range = 440.0;
            double eachVoteValue = range / sumOfUpToFirstSixIndexes;
            double iOSRectangleHeight = MainPanel.voteCounts.get(0) * eachVoteValue;
            double androidOSRectangleHeight = MainPanel.voteCounts.get(1) * eachVoteValue;
            double windowsOSRectangleHeight = MainPanel.voteCounts.get(2) * eachVoteValue;
            double blackberryOSRectangleHeight = MainPanel.voteCounts.get(3) * eachVoteValue;
            double linuxOSRectangleHeight = MainPanel.voteCounts.get(4) * eachVoteValue;

            // iOS, Index 0
            g.setColor(Color.red);
            int yLength = 485;
            g.fillRect(75, yLength - (int)iOSRectangleHeight, 550, (int)iOSRectangleHeight);
            yLength -= (int)iOSRectangleHeight;

            // Android, Index 1
            g.setColor(Color.blue);
            g.fillRect(75, yLength - (int)androidOSRectangleHeight, 550, (int)androidOSRectangleHeight);
            yLength -= (int)androidOSRectangleHeight;

            // Windows, Index 2
            g.setColor(Color.green);
            g.fillRect(75, yLength - (int)windowsOSRectangleHeight, 550, (int)windowsOSRectangleHeight);
            yLength -= (int)windowsOSRectangleHeight;

            // Blackberry, Index 3
            g.setColor(Color.yellow);
            g.fillRect(75, yLength - (int)blackberryOSRectangleHeight, 550, (int)blackberryOSRectangleHeight);
            yLength -= (int)blackberryOSRectangleHeight;

            // Linux, Index 4
            g.setColor(Color.orange);
            g.fillRect(75, yLength - (int)linuxOSRectangleHeight, 550, (int)linuxOSRectangleHeight);
            yLength -= (int)linuxOSRectangleHeight;
        }
        else if (MainPanel.voteCounts.size() == 6) {
            // Legend
            // iOS
            g.setColor(Color.red);
            g.fillRect(230, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("IOS", 252, 520);

            // Android OS
            g.setColor(Color.blue);
            g.fillRect(280, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("Android OS", 302, 520);

            // Windows OS
            g.setColor(Color.green);
            g.fillRect(382, 510, 20, 10);
            g.setColor(Color.black);
            g.drawString("Windows OS", 405, 520);

            // Blackberry
            g.setColor(Color.yellow);
            g.fillRect(205, 530, 20, 10);
            g.setColor(Color.black);
            g.drawString("Blackberry OS", 227, 540);

            // Linux
            g.setColor(Color.orange);
            g.fillRect(321, 530, 20, 10);
            g.setColor(Color.black);
            g.drawString("Linux OS", 345, 540);

            // Other OS
            g.setColor(Color.magenta);
            g.fillRect(415, 530, 20, 10);
            g.setColor(Color.black);
            g.drawString(MainPanel.categories.get(5), 437, 540);

            double sumOfUpToFirstSixIndexes = MainPanel.voteCounts.get(0) + MainPanel.voteCounts.get(1) + MainPanel.voteCounts.get(2) + MainPanel.voteCounts.get(3) + MainPanel.voteCounts.get(4) + MainPanel.voteCounts.get(5);
            double range = 440.0;
            double eachVoteValue = range / sumOfUpToFirstSixIndexes;
            double iOSRectangleHeight = MainPanel.voteCounts.get(0) * eachVoteValue;
            double androidOSRectangleHeight = MainPanel.voteCounts.get(1) * eachVoteValue;
            double windowsOSRectangleHeight = MainPanel.voteCounts.get(2) * eachVoteValue;
            double blackberryOSRectangleHeight = MainPanel.voteCounts.get(3) * eachVoteValue;
            double linuxOSRectangleHeight = MainPanel.voteCounts.get(4) * eachVoteValue;
            double indexFiveHeight = MainPanel.voteCounts.get(5) * eachVoteValue;


            // iOS, Index 0
            g.setColor(Color.red);
            int yLength = 485;
            g.fillRect(75, yLength - (int)iOSRectangleHeight, 550, (int)iOSRectangleHeight);
            yLength -= (int)iOSRectangleHeight;

            // Android, Index 1
            g.setColor(Color.blue);
            g.fillRect(75, yLength - (int)androidOSRectangleHeight, 550, (int)androidOSRectangleHeight);
            yLength -= (int)androidOSRectangleHeight;

            // Windows, Index 2
            g.setColor(Color.green);
            g.fillRect(75, yLength - (int)windowsOSRectangleHeight, 550, (int)windowsOSRectangleHeight);
            yLength -= (int)windowsOSRectangleHeight;

            // Blackberry, Index 3
            g.setColor(Color.yellow);
            g.fillRect(75, yLength - (int)blackberryOSRectangleHeight, 550, (int)blackberryOSRectangleHeight);
            yLength -= (int)blackberryOSRectangleHeight;

            // Linux, Index 4
            g.setColor(Color.orange);
            g.fillRect(75, yLength - (int)linuxOSRectangleHeight, 550, (int)linuxOSRectangleHeight);
            yLength -= (int)linuxOSRectangleHeight;

            // Index 5
            g.setColor(Color.magenta);
            g.fillRect(75, yLength - (int)indexFiveHeight, 550, (int)indexFiveHeight);
            yLength -= (int)indexFiveHeight;
        }
    }
}