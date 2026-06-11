package practice.level12;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адресс");
        String capt = sc.nextLine();
        String fileName = "image01.png";

        try {
            URL url = new URL(capt);
            Files.copy(url.openStream(), Path.of(fileName));
            System.out.println("Картинка успешно скачано!");
            System.out.println("Изображение успешно загружено и сохранено как " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

    }
}
