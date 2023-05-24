package IOStream;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("text.txt"));

            while (true) {
                String str = file.readLine();

                if (str == null)
                    break;

                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
