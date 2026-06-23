package practice.level16;

public class task13 {
    public static void main(String[] args) {
        DisplayBoard justMessage = new DisplayBoard();
        justMessage.showTemporaryMessage();
    }
}

class DisplayBoard {

    void showTemporaryMessage () {

        class  GreetingDisplay {
            void displayMessage() {
                System.out.println("Привет из локального класса!");
            }

        }
        GreetingDisplay display = new GreetingDisplay();
        display.displayMessage();
    }
}
