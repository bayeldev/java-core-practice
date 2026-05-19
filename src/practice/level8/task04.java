package practice.level8;

public class task04 {
    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
        String result = "";

        for(int i = 0;i<numberOfRepeats;i++) {
            result += messageText;

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        amplifyAndDisplay("Ура! ", 4);
    }
}
