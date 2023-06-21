package ButtonListener;

import javax.swing.*;
import java.awt.event.*;

public class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("Hello");
    }
}
