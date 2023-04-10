package Classes;

public class ExFieldScope {
    static int a;

    static void increaseA(int a) {
        a++;
    }

    public static void main(String[] args) {
        a = 45;
        System.out.println("1:" + a);
        increaseA(a);
        System.out.println("2:" + a);
    }
}