package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class task17 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String adress = sc.nextLine();
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(adress);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
