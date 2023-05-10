package Exception;

public class TryCatchExample1 {
    public static void main(String[] args) {
        int data;
        try {
            data = 50 / 0;
            //may throw an exception
        } catch (ArithmeticException e) {
            data = 0;
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
        System.out.println(data + " rest of the code");
    }
}
