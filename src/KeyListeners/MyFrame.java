package KeyListeners;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        JLabel label = new JLabel(("Wake up samurai, we have a city to burn.").toUpperCase());
        label.addKeyListener(new MyKeyListener());
        this.add(label);
        this.setSize(295, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        label.requestFocus();
    }
}

class Test {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
