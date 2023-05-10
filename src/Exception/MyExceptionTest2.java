package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest2 {
    public static void main(String[] args) {
        try {
            int num = getNum();
        } catch (InputMismatchException e) {
            System.out.println("Error: Input Mismatch!");
            e.printStackTrace();
        }
    }
    public static int getNum() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}