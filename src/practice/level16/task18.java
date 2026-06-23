package practice.level16;

public class task18 {
    public  static void main(String[] args) {
        SmartBox<Integer> intBox = new SmartBox<>();
        intBox.store(43);
        Integer value =  intBox.getContents();
        System.out.println(value);
  }
}


class SmartBox<T> {
    private T contents;

    void store(T item) {
        this.contents=item;
    }
    public T getContents() {
        return  contents;

    }
}
