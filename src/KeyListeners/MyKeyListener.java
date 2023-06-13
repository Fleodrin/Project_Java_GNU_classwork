package KeyListeners;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JLabel label = (JLabel) e.getSource();
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP -> label.setLocation(label.getX(), label.getY() - 10);
            case KeyEvent.VK_DOWN -> label.setLocation(label.getX(), label.getY() + 10);
            case KeyEvent.VK_LEFT -> label.setLocation(label.getX() - 10, label.getY());
            case KeyEvent.VK_RIGHT -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");
    }
}
