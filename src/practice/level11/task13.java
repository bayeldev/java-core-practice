package practice.level11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task13 {
    public static void accessSecretDocument (String documentPath)  throws FileNotFoundException {
        FileReader reader = new FileReader(documentPath);

    }

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length>0) {
            accessSecretDocument(args[0]);
        }
    }

}
