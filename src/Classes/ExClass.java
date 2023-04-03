package Classes;

class Point {
    int x;
    int y;
}

public class ExClass {
    public static void main(String[] args) {
        Point p = new Point();

        p.x = 1;
        p.y = 3;

        System.out.println("The point is (" + p.x + ", " + p.y + ")");
    }
}
