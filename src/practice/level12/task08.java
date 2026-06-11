package practice.level12;

import java.util.HashMap;

public class task08 {
    public static void main(String[] args) {
        String textContent = "java core java map";

        HashMap<String, Integer>  words = new HashMap<>();

        for(String word: textContent.split(" ")) {
            Integer count = words.get(word);

            words.put(word, (count==null) ? 1:count+1);
        }

//        System.out.println(words);

        for(var entry:words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
