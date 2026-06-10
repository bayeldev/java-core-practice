package practice.level11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task14 {
    public static void analyzeSystemLog(String logFileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(logFileName));

        reader.close();
    }

    public static void main(String[] args) {


        try {
            analyzeSystemLog("non_existent_log.txt");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
        }

    }
}
