package practice.level12;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class task09 {
    public static void main(String[] args) {
        Path pt = Path.of("src/practice/level12/myFile.txt");



        try {
            String content = "Сегодня плохой день!";

            Files.writeString(pt, content, StandardCharsets.UTF_8);
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            System.out.println("Ошибка"+e.getMessage());
        }


    }
}
