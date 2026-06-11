package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class task15 {
    public static void main(String[] args) throws Exception {

        String url = "https://httpbin.org/image/webp";


        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();


        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

        int status = response.statusCode();
        if (status == 200) {

            Path target = Path.of("image03.webp");
            Files.write(target, response.body());
        } else {

            System.out.println("Ошибка загрузки: код ответа " + status);
        }
    }
}
