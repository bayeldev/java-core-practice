package practice.level12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class task14 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://httpbin.org/image/jpeg");
        InputStream intu = url.openStream();
        OutputStream out = Files.newOutputStream(Path.of("image02.jpg"));
        intu.transferTo(out);
    }
}
