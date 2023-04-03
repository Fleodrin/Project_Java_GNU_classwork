package Methods;

public class NewLine {
    public static void newLine() {
        System.out.print("\n");
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }
}
