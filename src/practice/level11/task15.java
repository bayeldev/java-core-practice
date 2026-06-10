package practice.level11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task15 {
    public static void extractFirstLineFromData (String dataFile) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(dataFile);
        BufferedReader br = new BufferedReader(fr);
        String firstLine = br.readLine();
        br.close();

        System.out.println(firstLine);


    }

    public static void main(String[] args) {

    }
}
