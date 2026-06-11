package practice.level12;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task10 {
    public static void main(String[] args) {

//        Path p = Path.of("src/practice/level12/note.txt");
        Path pt = Path.of("src/practice/level12/note.txt");
        try {
            String content = Files.readString(pt);
            System.out.println("Файл успешно считан!");
            System.out.println(content);

        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}
