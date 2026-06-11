package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task19 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        URI uri = new URI("https://catfact.ninja/fact");

        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(res.body());
    }
}
