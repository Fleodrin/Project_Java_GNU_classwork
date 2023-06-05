package TemperatureConverter;

import javax.swing.*;
import java.awt.*;

public class GUITemperature extends JFrame {
    public GUITemperature() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel fahrenheitPanel = new JPanel();
        JLabel fahrenheitLabel = new JLabel("Fahrenheit temperature:");
        JTextField fahrenheitField = new JTextField("");
        fahrenheitField.setColumns(15);
        fahrenheitPanel.add(fahrenheitLabel);
        fahrenheitPanel.add(fahrenheitField);

        JPanel celsiusPanel = new JPanel();
        JLabel celsiusLabel = new JLabel("Celsius temperature:");
        JTextField celsiusField = new JTextField("");
        celsiusField.setColumns(15);
        celsiusPanel.add(celsiusLabel);
        celsiusPanel.add(celsiusField);

        JPanel buttonPanel = new JPanel();
        JButton convertButton = new JButton("Convert");
        buttonPanel.add(convertButton);

        mainPanel.add(fahrenheitPanel);
        mainPanel.add(celsiusPanel);
        mainPanel.add(buttonPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        convertButton.addActionListener(e -> {
            String fahrenheitText = fahrenheitField.getText();
            try {
                double fahrenheit = Double.parseDouble(fahrenheitText);
                double celsius = TemperatureConverter.convertFahrenheitToCelsius(fahrenheit);
                celsiusField.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                // Handle invalid input
                JOptionPane.showMessageDialog(GUITemperature.this, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}