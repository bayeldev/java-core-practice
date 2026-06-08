package practice.level09;

public class task15 {
    public static void main(String[] args) {
        String first="apple", second = "banana";

        int one = first.compareTo(second);
        System.out.println(one);
        String temp = second;
        second = first;
        first = temp;
        int two = second.compareTo(first);
        System.out.println(two);
    }
}
