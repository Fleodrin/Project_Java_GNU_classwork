package ButtonListener;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        JButton button = new JButton("BUTTON");
        button.addActionListener(new MyListener());
        this.add(button);
        setVisible(true);
    }
}

class MyFrameTest {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
    }
}
