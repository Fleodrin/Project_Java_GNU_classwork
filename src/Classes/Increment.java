package Classes;

public class Increment {
    int a;

    void increaseA() {
        a++;
    }
}

class ExFieldScope2 {
    public static void main(String[] args) {
        Increment inc = new Increment();
        inc.a = 45;
        System.out.println("1:" + inc.a);
        inc.increaseA();
        System.out.println("2:" + inc.a);
    }
}