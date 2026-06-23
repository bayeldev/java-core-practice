package practice.level16;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {

        DataPair<String> pair = new DataPair<>("Hi", "Diana");
        System.out.println(pair.getFirstElement()+" " + pair.getSecondElement());

    }
}

class DataPair<T> {
    private T firstElement;
    private T secondElement;

    DataPair(T firstElement, T secondElement) {
        this.firstElement=firstElement;
        this.secondElement=secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }
}
