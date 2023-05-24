package Logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        try {
            FileOutputStream file = new FileOutputStream("TimeLog.txt");
            file.write(format.format(date).getBytes());
            file.close();
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


