package Exception;

public class TryCatchExample2 {
    public static void main(String[] args) {
        int a[] = new int[5]; //may throw an exception
        try {
            a[10] = 50;
        } catch (Exception e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
        System.out.println("Everything is OK.");
    }
}
