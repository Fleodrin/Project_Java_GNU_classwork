import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Input Number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }

        System.out.println("End!");
    }
}