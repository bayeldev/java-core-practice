package practice.level16;

public class task01 {
    public static void main(String[] args) {
        Box box = new Box();
        Box.Label label = box.new Label();

        label.printLabel();

    }
}

class Box {


    class Label {
        void printLabel() {
            System.out.println("Box Label");
        }
    }
}
