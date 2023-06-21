package Abstract;

import java.util.ArrayList;

public class TestShape {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Circle());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
