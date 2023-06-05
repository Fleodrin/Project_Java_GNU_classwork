package MouseAdapters;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyListener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
}
