import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args) {
        int i = 1;
        int number;

        System.out.print("Input number: ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        while (i < number) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
            i += 2;
        }
    }
}