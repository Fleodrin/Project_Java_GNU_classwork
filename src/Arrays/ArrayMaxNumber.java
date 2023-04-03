package Arrays;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        int[] values = {1, 120, 56, 78, 87};
        int i = 1;
        int max = values[0];

        while (i < values.length) {
            if (values[i] > max) max = values[i];

            i = i + 1;
        }

        System.out.println(max);
    }
}
