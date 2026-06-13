package practice.level14;

public class task07 {
    public static void main(String[] args) {
      Counter first = new Counter();
      first.increment();
      first.increment();
      first.increment();

      first.printValue();
    }
}

class Counter {
    int currentValue;

    void increment() {
        currentValue++;
    }
    void printValue() {
        System.out.println(currentValue);
    }
}
