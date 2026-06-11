package practice.level12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task11 {
    public static void main(String[] args) throws IOException {
        byte[] word = {72, 73, 74};
        Path pt = Path.of("letters.bin");
        Files.write(pt, word);
        System.out.println(pt.toAbsolutePath());

        byte[]wordRead = Files.readAllBytes(Path.of("letters.bin"));

        for(byte w:wordRead) {
            System.out.print((char)w+" ");
        }


    }
}
