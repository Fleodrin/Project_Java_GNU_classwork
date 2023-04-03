package Classes;

public class ExFieldScope {
    static int a;

    static int increaseA(int a) {
        return a = a + 1;
    }

    static void increaseA() {
        a++;
    }

    public static void main(String[] args) {
        a = 45;
        System.out.println("1:" + a);
        a = increaseA(a);
        System.out.println("2:" + a);
        increaseA();
        System.out.println("3:" + a);
    }
}