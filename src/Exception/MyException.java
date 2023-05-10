package Exception;

public class MyException extends Throwable {
    private static int num;

    public MyException(int num) {
        this.num = num;
    }

    public static int getNum() {
        return num;
    }
}
