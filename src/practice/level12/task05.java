package practice.level12;

import java.util.HashMap;

public class task05 {
    public static void main(String[] args) {
        HashMap<String, String> travelPhrasebook = new HashMap<>();
        travelPhrasebook.put("дом", "house");
        String key = travelPhrasebook.get("дом");
        System.out.println(key);
    }
}
