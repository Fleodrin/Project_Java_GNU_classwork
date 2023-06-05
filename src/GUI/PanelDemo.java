package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelDemo extends JFrame {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    public PanelDemo() {
        super("Panel demo");
        p1.add(new JButton("JButton"));
        p1.add(new JButton("JButton"));
        p2.add(new JTextArea("JTextArea"));
        Container cp = getContentPane();
        cp.add(p1, BorderLayout.NORTH);
        cp.add(p2, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        PanelDemo PanelDemo = new PanelDemo();
    }
}