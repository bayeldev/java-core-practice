package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task18 {
    public static void main(String[] args)  throws Exception {
        HttpClient cl = HttpClient.newHttpClient();
        URI uri = new URI("http://api.open-notify.org/iss-now.json");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<Void> res = cl.send(request, HttpResponse.BodyHandlers.discarding());

        System.out.println(res.statusCode());

    }
}
