package ButtonListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    int count = 0;
    public void actionPerformed(ActionEvent e) {
        count ++;
        JButton button = (JButton) e.getSource();
        if (count == 1) {
            button.setText("Hello");
        } else if (count == 2) {
            button.setText("Bye");
        }
    }
}
