package GUI;

import javax.swing.*;
import java.awt.*;

class Hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        FlowLayout L = new FlowLayout();

        JPanel mainPanel = new JPanel();

        JPanel fahrenheitPanel = new JPanel();
        JLabel fahrenheitLabel = new JLabel("Fahrenheit temperature:");
        JTextField fahrenheitField = new JTextField("");
        fahrenheitField.setColumns(15);

        JPanel celsiusPanel = new JPanel();
        JLabel celsiusLabel = new JLabel("Celsius temperature:");
        JTextField celsiusField = new JTextField("");
        celsiusField.setColumns(15);

        JPanel buttonPanel = new JPanel();
        JButton convertButton = new JButton("Convert");

        celsiusPanel.add(celsiusLabel);
        celsiusPanel.add(celsiusField);

        fahrenheitPanel.add(fahrenheitLabel);
        fahrenheitPanel.add(fahrenheitField);

        buttonPanel.add(convertButton);

        mainPanel.add(fahrenheitPanel);
        mainPanel.add(celsiusPanel);
        mainPanel.add(buttonPanel);

        frame.add(mainPanel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}