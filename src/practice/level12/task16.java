package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class task16 {
    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/image/png"))
                .GET()
                .build();


        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());


        String contentType = response.headers()
                .firstValue("Content-Type")
                .orElse("unknown");


        byte[] body = response.body();
        int size = body.length;


        System.out.println("Тип: " + contentType + ", Размер: " + size + " байт");


        Files.write(Path.of("image04.png"), body);
    }
}
