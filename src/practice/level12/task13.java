package practice.level12;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String capt = sc.nextLine();
        try {
            URL url = new URL(capt);
            Files.copy(url.openStream(), Path.of("a.jpg"));
            System.out.println("Картинка успешно скачано!");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

    }
}
