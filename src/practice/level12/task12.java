package practice.level12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task12 {
    public static void main(String[] args) throws IOException {
        Path in = Path.of("letters.bin");
        Path out = Path.of("letters_copy.bin");

        byte[] bytes = Files.readAllBytes(in);
        Files.write(out, bytes);
    }
}
