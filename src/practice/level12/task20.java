package practice.level12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class task20 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        URI uri = new URI("http://api.open-notify.org/iss-now.json");
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        // Вручную находим в строке объект "iss_position"
        int issPosIndex = body.indexOf("\"iss_position\"");
        if (issPosIndex < 0) {
            System.out.println("Не удалось найти объект iss_position в ответе.");
            return;
        }

        // Находим границы объекта iss_position: от '{' до соответствующей '}'
        int startBrace = body.indexOf('{', issPosIndex); // открывающая скобка объекта
        int endBrace = body.indexOf('}', startBrace);    // закрывающая скобка объекта (внутри нет вложенных объектов)
        String issObject = body.substring(startBrace, endBrace + 1);

        // Внутри iss_position извлекаем значения полей "latitude" и "longitude"
        String latitude = extractQuotedValue(issObject, "latitude");
        String longitude = extractQuotedValue(issObject, "longitude");

        // Форматированный вывод координат
        System.out.println("Текущие координаты МКС: широта = " + latitude + ", долгота = " + longitude);

    }
    private static String extractQuotedValue(String jsonFragment, String fieldName) {
        int keyPos = jsonFragment.indexOf("\"" + fieldName + "\""); // позиция ключа "fieldName"
        int colonPos = jsonFragment.indexOf(':', keyPos);           // двоеточие после ключа
        int firstQuote = jsonFragment.indexOf('"', colonPos + 1);   // открывающая кавычка значения
        int secondQuote = jsonFragment.indexOf('"', firstQuote + 1); // закрывающая кавычка значения
        return jsonFragment.substring(firstQuote + 1, secondQuote);  // само значение между кавычками
    }
}
